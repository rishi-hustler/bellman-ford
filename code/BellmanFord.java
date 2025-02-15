import java.util.Scanner;
// BY RISHI HUSTLER

class Edge {
    int src, dest, weight;

    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

public class BellmanFord {

    static void bellmanFord(int V, int E, Edge[] edges, int source) {

        int[] dist = new int[V];

        // Step 1: Initialize distances
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[source] = 0;

        // Step 2: Relax all edges V-1 times
        for (int i = 1; i <= V - 1; i++) {
            for (int j = 0; j < E; j++) {
                int u = edges[j].src;
                int v = edges[j].dest;
                int w = edges[j].weight;

                if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                }
            }
        }

        // Step 3: Check for negative weight cycles
        for (int j = 0; j < E; j++) {
            int u = edges[j].src;
            int v = edges[j].dest;
            int w = edges[j].weight;

            if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
                System.out.println("Graph contains a negative weight cycle");
                return;
            }
        }

        // Print results
        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < V; i++) {
            if (dist[i] == Integer.MAX_VALUE)
                System.out.println(i + "\t\tINF");
            else
                System.out.println(i + "\t\t" + dist[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        Edge[] edges = new Edge[E];

        for (int i = 0; i < E; i++) {
            System.out.print("Enter src, dest, weight: ");
            int src = sc.nextInt();
            int dest = sc.nextInt();
            int weight = sc.nextInt();
            edges[i] = new Edge(src, dest, weight);
        }

        System.out.print("Enter source vertex: ");
        int source = sc.nextInt();

        bellmanFord(V, E, edges, source);
        sc.close();
    }
}
