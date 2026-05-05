import java.util.*;

class PrimDemo2 {
    public static void main(String[] args) {
        // Adjacency list of IntegerTriple (weight, u, v)
        List<List<IntegerTriple>> adjList = getGraph();
        int n = adjList.size(); // no of vertices

        /* Prim's Algorithm */
        // cost of mst
        int cost = 0;
        Set<Integer> taken = new HashSet<>(); // set of vertices in mst

        // add neighbours of vertex/pt 0 to the pq
        int src = 0;
        taken.add(src);
        PriorityQueue<IntegerTriple> pq = new PriorityQueue<>(adjList.get(src));

        // Change: Use parent array to reconstruct MST edges at the end
        int parent[] = new int[n];
        Arrays.fill(parent, -1);
        
        while (!pq.isEmpty()) {
            if (taken.size() == n) {
                break;
            }

            IntegerTriple edge = pq.poll();
            int parentVertex = edge.u();
            int u = edge.v();

            // skip if vertex u is already in mst
            if (taken.contains(u)) {
                continue; 
            }

            // add edge to mst
            taken.add(u);
            cost += edge.weight();
            parent[u] = parentVertex; // update parent of the added vertex

            for (IntegerTriple neighbour : adjList.get(u)) {
                int v = neighbour.v();

                if (!taken.contains(v)) {
                    pq.offer(neighbour);
                }
            }
        }

        System.out.println("Cost of MST: " + cost);
        System.out.println("Edges in MST:");
        for (int i = 0; i < n; i++) {
            if (i != src) {
                System.out.println(parent[i] + " " + i);
            }
        }
    }

    public static List<List<IntegerTriple>> getGraph() {
        int n = 5; // number of vertices
        
        // create adjacency list of IntegerTriple (weight, u, v)
        List<List<IntegerTriple>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        // Graph edges and weights
        // see graph.png for the graph structure
        adjList.get(0).add(new IntegerTriple(1, 0, 1));
        adjList.get(1).add(new IntegerTriple(1, 1, 0));
        adjList.get(0).add(new IntegerTriple(3, 0, 2));
        adjList.get(2).add(new IntegerTriple(3, 2, 0));
        adjList.get(1).add(new IntegerTriple(2, 1, 2));
        adjList.get(2).add(new IntegerTriple(2, 2, 1));
        adjList.get(1).add(new IntegerTriple(4, 1, 3));
        adjList.get(3).add(new IntegerTriple(4, 3, 1));
        adjList.get(1).add(new IntegerTriple(8, 1, 4));
        adjList.get(4).add(new IntegerTriple(8, 4, 1));
        adjList.get(2).add(new IntegerTriple(5, 2, 3));
        adjList.get(3).add(new IntegerTriple(5, 3, 2));
        adjList.get(2).add(new IntegerTriple(6, 2, 4));
        adjList.get(4).add(new IntegerTriple(6, 4, 2));
        adjList.get(3).add(new IntegerTriple(7, 3, 4));
        adjList.get(4).add(new IntegerTriple(7, 4, 3));

        return adjList;
    }
}
