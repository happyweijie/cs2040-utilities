import java.util.*;

class ByFirstTwoLetters implements Comparator<String> {
    public int compare(String name1, String name2) {
        // Note: s.substring(i, j) returns a substring of String s starting from index i to j - 1
        // In this case we want to get the letters at index 0 and 1 of each name
        String first = name1.substring(0, 2);
        String second = name2.substring(0, 2);

        return first.compareTo(second); // use String's Comparable
    }
}