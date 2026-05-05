/**
 *  https://open.kattis.com/problems/sortofsorting
 */
import java.io.*;
import java.util.*;

class SortOfSorting {
    public static void main(String[] args) throws IOException {
        // Input Output
        Kattio io = new Kattio(System.in);
        
        // number of names
        int nameCount = io.getInt();

        // Add names to array
        String[] names = new String[nameCount];
        for (int i = 0; i < nameCount; i++) {
            names[i] = io.getWord();
        }

        // Task: Sort the names by first 2 letters
        // This is custom sorting criteria so we need to use Comparator

        // Method 1: Concrete Class
        // Use this if you want to reuse the Comparator multiple times
        // Arrays.sort(names, new ByFirstTwoLetters());

        /*
        // Method 2: Anonymous Class
        // Shown for reference, not recommended
        Arrays.sort(names, new Comparator<String>() {
            public int compare(String name1, String name2) {
                String first = name1.substring(0, 2);
                String second = name2.substring(0, 2);

                return first.compareTo(second); // use String's Comparable
            }
        });
        */

        // Method 3: Lambda Function (Recommended Method)
        Arrays.sort(names, (name1, name2) -> {
            String first = name1.substring(0, 2);
            String second = name2.substring(0, 2);

            return first.compareTo(second); // use String's Comparable
        });

        // print each name of the sorted array
        for (String name : names) {
            io.println(name);
        }

        // Print output
        io.close();
    }
}
