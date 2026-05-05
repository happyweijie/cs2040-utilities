import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        // sort the integers
        int[] numbers = {5, 2, 8, 3};
        Arrays.sort(numbers);
        System.out.println("Numbers sorted: " + Arrays.toString(numbers));

        // sort the Strings
        String[] words = {"apple", "carrot", "pear", "banana", "orange"};
        Arrays.sort(words);
        System.out.println("Words sorted: " + Arrays.toString(words));
    }
}
