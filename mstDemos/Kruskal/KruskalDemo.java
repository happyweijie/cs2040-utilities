import java.util.*;

class KruskalDemo {
    
    public static void main(String[] args) {

        List<IntegerTriple> edgeList = getEdgeList();
        int n = 5; // number of vertices
            
        UFDS ufds = new UFDS(n);

        // save the edges in the mst (can use array too)
        List<IntegerTriple> mst = new ArrayList<>();
        
        // cost of the mst
        int cost = 0;

        Collections.sort(edgeList); // sort the edge list

        // go through the edges from smallest to largest
        for (IntegerTriple edge : edgeList) {
            // break early if all vertices are in the mst
            if (ufds.countSets() == 1) { 
                break;
            }

            // prevent cycles
            if (ufds.isSameSet(edge.u(), edge.v())) {
                continue;
            }

            // add edge to the mst
            mst.add(edge);
            ufds.unionSet(edge.u(), edge.v()); // union the vertices
            cost += edge.weight();
        }

        // print out the cost of the mst
        System.out.println("Cost of the MST: " + cost);
        
        // print out the edges in the mst
        System.out.println("Edges in the MST:");
        for (IntegerTriple edge : mst) {
            System.out.println(edge.u() + " " + edge.v());
        }
    }

    // edge list for graph.png
    // see graph.png for the actual graph
    public static List<IntegerTriple> getEdgeList() {
        List<IntegerTriple> edgeList = new ArrayList<>();
            
        // add edges to the edge list
        edgeList.add(new IntegerTriple(1, 0, 1));
        edgeList.add(new IntegerTriple(3, 0, 2));
        edgeList.add(new IntegerTriple(2, 1, 2));
        edgeList.add(new IntegerTriple(4, 1, 3));
        edgeList.add(new IntegerTriple(5, 2, 3));
        edgeList.add(new IntegerTriple(6, 2, 4));
        edgeList.add(new IntegerTriple(7, 3, 4));
        edgeList.add(new IntegerTriple(8, 1, 4));

        return edgeList;
    }
}
