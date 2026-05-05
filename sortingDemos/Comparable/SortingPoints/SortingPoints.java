import java.util.*;

public class SortingPoints {
    public static void main(String[] args) {
        // Create an array of points
        Point[] points = { 
            new Point(3, 4), 
            new Point(1, 7), 
            new Point(5, 2),
            new Point(0, 0),
            new Point(1, 3)
        };

        System.out.println("Before sorting: " + Arrays.toString(points));
        // Sort the points making use of Point's compareTo method
        Arrays.sort(points);
        System.out.println("After sorting: " + Arrays.toString(points));
    }
}