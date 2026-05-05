import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        // Create a HashMap
        // Key is a String
        // Value is an Integer
        HashMap<String, Integer> scores = new HashMap<>();

        // Insert entries
        scores.put("Alice", 85);
        scores.put("Bob", 92);
        scores.put("Charlie", 78);

        // iterate through all hash map entries using entrySet()
        System.out.println("\nIterating through entries with entrySet():\n");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        } 
    }
}