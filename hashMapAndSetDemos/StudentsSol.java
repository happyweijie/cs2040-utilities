import java.util.HashMap;

class StudentsSol {
    /**
     * Given an array of student names,
     * count the number of occurences of each name.
     */
    public static void main(String[] args) {
        String[] students = { 
            "Alex", "Ben", "Alex", "Diana", "Ben",
            "Alex", "Ethan", "Diana", "Ben", "Alex"
        };

        // Key is String, Value is Integer
        HashMap<String, Integer> nameMap = new HashMap<>();

        for (String name : students) {
            if (!nameMap.containsKey(name)) {
                nameMap.put(name, 0);
            }

            nameMap.put(name, nameMap.get(name) + 1);
        }

        // Print each name and its count
        for (String name : nameMap.keySet()) {
            // Format: "<name>: <count>"
            System.out.println(name + ": " + nameMap.get(name));
        }
    }
}