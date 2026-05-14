import java.util.HashMap;

class Students {
    /**
     * Exercise:
     * Given an array of student names,
     * count the number of occurences of each name.
     */
    public static void main(String[] args) {
        String[] students = { 
            "Alex", "Ben", "Alex", "Diana", "Ben",
            "Alex", "Ethan", "Diana", "Ben", "Alex"
        };

        // Replace the question marks with the correct data type
        HashMap<String, Integer> namesMap = new HashMap<>();

        // Count occurences of each name
        for (String name : students) {
            // if name not in name_map
            if (!namesMap.containsKey(name)) {
                namesMap.put(name, 0);
            }

            // name_map[name] += 1
            namesMap.put(name, namesMap.get(name) + 1);
        }

        /* Print each name and its count by iterating over the keys
        Format: "<name>: <count>" */
        for (String name : namesMap.keySet()) {
            System.out.println(name + ": " + namesMap.get(name));
        }
    }
}