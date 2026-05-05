import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Create a TreeSet of integers
        TreeSet<Integer> numbers = new TreeSet<>();

        // Basic insertion
        System.out.println("Insertion:");
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        System.out.println("TreeSet after insertion: " + numbers);

        // Check contains
        System.out.println("\nContains:");
        System.out.println("Contains 10? " + numbers.contains(10));
        System.out.println("Contains 7? " + numbers.contains(7));

        // Basic deletion
        System.out.println("\nDeletion:");
        numbers.remove(5);
        System.out.println("TreeSet after removing 5: " + numbers);

        // Ceiling and Floor - NEW METHOD
        // Recall our treeset contains  10, 15, 20
        System.out.println("\nCeiling and Floor:");
        System.out.println("Ceiling of 12: " + numbers.ceiling(12)); // smallest >= 12
        System.out.println("Floor of 12: " + numbers.floor(12));     // largest <= 12

        // First and Last - NEW METHOD
        System.out.println("\nFirst and Last:");
        System.out.println("First element: " + numbers.first());
        System.out.println("Last element: " + numbers.last());

        // Iterating over the TreeSet
        System.out.println("\nIterating over TreeSet:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}