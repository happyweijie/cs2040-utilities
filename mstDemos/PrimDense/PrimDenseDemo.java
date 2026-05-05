/**
 * Prim's algorithm (dense version) with path reconstruction.
 */
class PrimDenseDemo {

    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {

        // adjacency matrix representation of the graph
        int[][] adjMatrix = {
            {0, 2, 3, 6},
            {2, 0, 1, 4},
            {3, 1, 0, 5},
            {6, 4, 5, 0}
        };

        // number of vertices
        int n = adjMatrix.length;
        
        /* Prim's Algorithm (Dense Version) */
        int mstCost = 0; // cost of MST

        // array which stores {minWeight, parent} for each vertex
        int[][] minWeight = new int[n][2];
        int[] parent = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            minWeight[i][0] = INF;
            minWeight[i][1] = -1;

            parent[i] = -1;
            visited[i] = false;
        }

        // Start from source vertex 0
        int src = 0;
        minWeight[src][0] = 0;
        minWeight[src][1] = 0;

        // while not all vertices are in T
        for (int i = 0; i < n; i++) {

            // Scan minWeight to find unvisited u with minimum value
            int u = -1;
            for (int j = 0; j < n; j++) {
                if (!visited[j] && (u == -1 || minWeight[j][0] < minWeight[u][0])) {
                    u = j;
                }
            }

            // Add vertex to MST
            mstCost += minWeight[u][0];
            parent[u] = minWeight[u][1];
            visited[u] = true;

            // for all v adjacent to u
            for (int v = 0; v < n; v++) {
                // if v not in T and edge (u, v) exists
                if (!visited[v] && adjMatrix[u][v] != 0) {
                    if (adjMatrix[u][v] < minWeight[v][0]) {
                        minWeight[v][0] = adjMatrix[u][v];
                        minWeight[v][1] = u;
                    }
                }
            }
        }

        System.out.println("MST cost: " + mstCost);

        // Reconstruct MST edges from parent array
        System.out.println("Edges in MST:");
        for (int i = 0; i < n; i++) {
            if (i != src) {
                System.out.println(parent[i] + ", " + i);
            }
        }
    }
}