import java.util.*;

class PrimDemo {
    public static void main(String[] args) {
        // Adjacency list of IntegerPair (weight, neighbor)
        List<List<IntegerPair>> adjList = getGraph();
        int n = adjList.size(); // no of vertices

        /* Prim's Algorithm */
        // cost of mst
        int cost = 0;
        Set<Integer> taken = new HashSet<>(); // set of vertices in mst

        // add neighbours of vertex/pt 0 to the pq
        int src = 0;
        taken.add(src);
        PriorityQueue<IntegerPair> pq = new PriorityQueue<>(adjList.get(src));
        
        while (!pq.isEmpty()) {
            if (taken.size() == n) {
                break;
            }

            IntegerPair edge = pq.poll();
            int u = edge.v();

            // skip if vertex u is already in mst
            if (taken.contains(u)) {
                continue; 
            }

            // add edge to mst
            taken.add(u);
            cost += edge.weight();

            for (IntegerPair neighbour : adjList.get(u)) {
                int v = neighbour.v();

                if (!taken.contains(v)) {
                    pq.offer(neighbour);
                }
            }
        }

        System.out.println("Cost of MST: " + cost);
    }

    public static List<List<IntegerPair>> getGraph() {
        int n = 5; // number of vertices
            
        // create adjacency list of IntegerPair (weight, neighbor)
        List<List<IntegerPair>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        adjList.get(0).add(new IntegerPair(1, 1));
        adjList.get(1).add(new IntegerPair(1, 0));
        adjList.get(0).add(new IntegerPair(3, 2));
        adjList.get(2).add(new IntegerPair(3, 0));
        adjList.get(1).add(new IntegerPair(2, 2));
        adjList.get(2).add(new IntegerPair(2, 1));
        adjList.get(1).add(new IntegerPair(4, 3));
        adjList.get(3).add(new IntegerPair(4, 1));
        adjList.get(1).add(new IntegerPair(8, 4));
        adjList.get(4).add(new IntegerPair(8, 1));
        adjList.get(2).add(new IntegerPair(5, 3));
        adjList.get(3).add(new IntegerPair(5, 2));
        adjList.get(2).add(new IntegerPair(6, 4));
        adjList.get(4).add(new IntegerPair(6, 2));
        adjList.get(3).add(new IntegerPair(7, 4));
        adjList.get(4).add(new IntegerPair(7, 3));

        return adjList;
    }
}
