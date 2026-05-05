import java.util.*;

/**
 * In this program, we want our own custom Point class to work with a HashMap/HashSet.
 * <p>
 * We need to write 2 methods in the Point class:
 * 1. hashCode -> Helps us generate a hash value for an instance of an Object in the map. Determine which bucket to put it in.
 * 2. equals -> Helps us compare objects in the map, used to determine if we have a conflict i.e 2 keys have the same hash value.
 * 
 * By default, hashCode and equals are generated based on an Objects's memory location.
 * For our Point class, we want to generate hashCode and equals based on the attributes of the Point.
 */
class Main {
    public static void main(String[] args) {
        HashSet<Point> points = new HashSet<>();

        points.add(new Point(1, 1));
        points.add(new Point(1, 1));
        points.add(new Point(1, 2));

        System.out.println(points);
    }
}

/**
 * Point class with equals and hashCode methods
 */
class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int hashCode() {
        // Compute hash value based on attributes
        return Objects.hash(this.x, this.y);
    }
    
    public boolean equals(Object obj) {
        // Check if this and obj have same memory location
        if (this == obj) {
            return true;
        }

        /*
        Line 53 does 2 things:
        1. This line checks if obj is a point instance
        2. If yes, obj is typecasted to a Point object called p
        */
        if (obj instanceof Point p) {
            return this.x == p.x &&
                this.y == p.y;
        }

        return false;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}