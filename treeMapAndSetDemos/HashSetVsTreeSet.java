import java.util.*;

class HashSetVsTreeSet {
    public static void main(String[] args) {
        // TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        
        // HashSet
        HashSet<Integer> hashSet = new HashSet<>();

        // Insert elements
        List<Integer> elements = List.of(100, 50, 75, 25, 10, 5);
        for (int i : elements) {
            treeSet.add(i);
            hashSet.add(i);
        }
        
        // Display TreeSet (sorted)
        System.out.println("TreeSet (sorted):");
        for (int num : treeSet) {
            System.out.println(num);
        }
        System.out.println("\n");

        // Display HashSet (unordered)
        System.out.println("HashSet (unordered):");
        for (int num : hashSet) {
            System.out.println(num);
        }
    }
}