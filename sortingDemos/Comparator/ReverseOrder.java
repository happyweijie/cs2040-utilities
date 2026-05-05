import java.util.Arrays;
import java.util.Comparator;

public class ReverseOrder {
    public static void main(String[] args) {
        Integer[] numbers = {3, 7, 1, 5};

        // Built-in reverse order comparator
        // Think of it as the opposite of the Comparable
        Arrays.sort(numbers, Comparator.reverseOrder()); 
        System.out.println(Arrays.toString(numbers));
    }
}
