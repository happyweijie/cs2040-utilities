import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        // Create a HashSet
        HashSet<String> seen = new HashSet<>();

        // add(value)
        seen.add("Alice");
        seen.add("Bob");
        seen.add("Charlie");
        seen.add("Alice");   // duplicate

        // System.out.println("Set after adding elements:");
        System.out.println(seen);

        // contains(value)
        // Unlike with List/Array, this takes O(1) time
        System.out.println("\nContains Bob: " + seen.contains("Bob"));
        System.out.println("Contains David: " + seen.contains("David"));

        // iterate through the hash set
        System.out.println("\nIterating through set:");
        for (String name : seen) {
            System.out.println(name);
        } 
    }
}
