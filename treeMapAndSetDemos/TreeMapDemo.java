import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        // Create a TreeMap with String keys and Integer values
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Basic insertion
        System.out.println("Insertion:");
        treeMap.put("Alice", 30);
        treeMap.put("Bob", 25);
        treeMap.put("Charlie", 35);
        treeMap.put("David", 28);
        System.out.println("TreeMap after insertion: " + treeMap);

        // Check containsKey
        System.out.println("\nContains:");
        System.out.println("Contains key 'Alice'? " + treeMap.containsKey("Alice"));
        System.out.println("Contains key 'David'? " + treeMap.containsKey("David"));

        // Basic deletion
        System.out.println("\nDeletion:");
        treeMap.remove("Bob");
        System.out.println("TreeMap after removing Bob: " + treeMap);

        // Ceiling and Floor Entry - NEW METHOD
        // Our TreeMap contains keys "Alice", "Charlie", "David"
        System.out.println("\nCeiling and Floor Entry:");
        Map.Entry<String, Integer> ceilingEntry = treeMap.ceilingEntry("B");
        System.out.println("Ceiling entry of 'B': " + ceilingEntry); // smallest key >= "B"
        
        Map.Entry<String, Integer> floorEntry = treeMap.floorEntry("B"); // largest key <= "B"
        System.out.println("Floor entry of 'B': " + floorEntry);
        // If we just need the key, we can use ceilingKey and floorKey
        
        // First and Last entry - NEW METHOD
        // Recall our TreeMap contains keys "Alice", "Charlie", "David"
        System.out.println("\nFirst and Last entry:");
        System.out.println("First entry: " + treeMap.firstEntry()); // minimum key entry
        System.out.println("Last entry: " + treeMap.lastEntry()); // maximum key entry
        // If we just need the key, we can use firstKey and lastKey

        // Iterating over the TreeMap
        System.out.println("\nIterating over TreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // if we just need keys or values, we can use keySet and values
        System.out.println("\nIterating over keys:");
        for (String key : treeMap.keySet()) {
            System.out.println(key);
        }
    }
}
