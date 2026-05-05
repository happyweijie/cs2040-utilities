/**
 * Represents edges in a weighted graph.
 */
class IntegerTriple implements Comparable<IntegerTriple> {

    int weight;
    int u;
    int v;

    public IntegerTriple(int weight, int u, int v) {
        this.weight = weight; // weight of edges
        this.u = u; // starting vertex
        this.v = v; // ending vertex
    }

    public int weight() {
        return this.weight;
    }

    public int u() {
        return this.u;
    }

    public int v() {
        return this.v;
    }

    @Override
    public int compareTo(IntegerTriple other) {
        return Integer.compare(this.weight, other.weight);
    }

    @Override
    public String toString() {
        return "Edge(weight=" + weight + ", u=" + u + ", v=" + v + ")";
    }
}