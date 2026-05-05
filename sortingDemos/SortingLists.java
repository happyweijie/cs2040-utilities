import java.util.*;

class SortingLists {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>();
        words.add("apple");
        words.add("carrot");
        words.add("pear");
        words.add("banana");
        words.add("orange");
        System.out.println("Before: " + words);
        Collections.sort(words);
        System.out.println("After: " + words);
    }
}
