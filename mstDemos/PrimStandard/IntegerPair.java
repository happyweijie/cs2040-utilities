class IntegerPair implements Comparable<IntegerPair> {

    int weight;
    int v;

    public IntegerPair(int weight, int v) {
        this.weight = weight;
        this.v = v;
    }

    public int weight() {
        return this.weight;
    }

    public int v() {
        return this.v;
    }

    @Override
    public int compareTo(IntegerPair other) {
        return Integer.compare(this.weight, other.weight);
    }

    @Override
    public String toString() {
        return "(" + weight + ", " + v + ")";
    }
}