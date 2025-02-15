# Bellman–Ford Algorithm (Java)

## 📌 Overview

The **Bellman–Ford Algorithm** is a **single-source shortest path algorithm** that works with graphs containing **negative edge weights**.

Unlike Dijkstra’s algorithm, Bellman–Ford can **detect negative weight cycles**, making it suitable for more general graphs.

---

## 🚀 Algorithm Used

**Dynamic Programming / Edge Relaxation**

### Steps:

1. Initialize distances from the source to all vertices as infinity
2. Relax all edges **V − 1 times**
3. Perform one more relaxation to check for **negative weight cycles**

---

## 🧮 Time and Space Complexity

* **Time Complexity:** `O(V × E)`
* **Space Complexity:** `O(V)`

---

## 🛠️ Requirements

* Java 8 or later
* Any Java IDE or terminal

---

## 📂 Project Structure

```
BellmanFord.java
README.md
```

---

## ▶️ How to Run

1. Compile the program:

   ```bash
   javac BellmanFord.java
   ```
2. Run the program:

   ```bash
   java BellmanFord
   ```

---

## ⌨️ Sample Input

```
Enter number of vertices: 5
Enter number of edges: 8
Enter src, dest, weight:
0 1 -1
0 2 4
1 2 3
1 3 2
1 4 2
3 2 5
3 1 1
4 3 -3
Enter source vertex: 0
```

---

## ✅ Sample Output

```
Vertex  Distance from Source
0       0
1       -1
2       2
3       -2
4       1
```

---

## 🧠 Key Concepts

* Shortest Path Algorithms
* Edge Relaxation
* Negative Weight Cycles
* Graph Theory

---

## 🔧 Customization Ideas

* Convert to adjacency list representation
* Print actual shortest paths
* Compare output with Dijkstra’s algorithm
* Make a menu-driven shortest path program

---

## 📚 Applications

* Network routing protocols (e.g., RIP)
* Currency arbitrage detection
* Graphs with penalties or credits
* Distance-vector routing

---

## 📝 License

Free to use for academic, learning, and interview preparation.


