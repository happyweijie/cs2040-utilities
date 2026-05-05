import java.util.*;

class HashMapDanger {
    /**
     * Unlike Python, Java doesn't prevent you from using mutable data
     * structures like list, stack, queue etc as keys. 
     * 
     * However, best practice is AVOID using any mutable data types 
     * as keys. Doing so may lead to data corruption or accidental 
     * overwriting.
     */
    public static void main(String[] args) {
        HashMap<ArrayList<Integer>, String> map = new HashMap<>();

        // Add [1] to the map
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        map.put(list1, "This is list1");

        // Add [] to the map
        ArrayList<Integer> list2 = new ArrayList<>();
        map.put(list2, "This is list2");

        // Everything looks okay
        System.out.println(list1 + ": " + map.get(list1));
        System.out.println(list2 + ": " + map.get(list2));

        // Let's add one more element to list 2
        list1.add(2); // list1 is now [1, 2]
        System.out.println("\nAfter mutating list1:");
        System.out.println(list1 + ": " + map.get(list1));
        System.out.println(list2 + ": " + map.get(list2)); 

        // Adding elements to list2
        list2.add(1);
        System.out.println("\nAfter mutating list2:");
        System.out.println(list1 + ": " + map.get(list1));
        System.out.println(list2 + ": " + map.get(list2));

        /**
         * HashMap stores keys based on their hash value.
         * If a key is changed after insertion, its hash value changes,
         * so the map may no longer be able to find it.
         */
    }
}