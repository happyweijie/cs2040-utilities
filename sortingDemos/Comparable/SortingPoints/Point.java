class Point implements Comparable<Point> {
    public int x;
    public int y;

    public Point(int x, int y) { 
        this.x = x; 
        this.y = y; 
    }

    public int compareTo(Point other) {
        // xDiff < 0 if this.x < other.x
        // xDiff > 0 if this.x > other.x
        // xDiff == 0 if this.x == other.x
        int xDiff = this.x - other.x;
        if (xDiff != 0) {
            return xDiff;
        }

        return this.y - other.y;
    }

    public String toString() { 
        return "(" + x + "," + y + ")"; 
    }
}