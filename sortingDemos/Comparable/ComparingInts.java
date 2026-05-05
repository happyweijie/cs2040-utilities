public class ComparingInts {
    public static void main(String[] args) {
        // Compare two objects, we should an int
        // if a < b, then return a negative int
        // if a == b, then return 0
        // if a > b, then return a positive int

        System.out.println("Comparing Integers: ");
        int a = 5;
        int b = 3;
        // Positive number since a > b
        System.out.println("Integer compare (a - b): " + (a - b));
        
        int c = 5;
        // 0 since a == c
        System.out.println("Integer compare (a - c): " + (a - c));

        // Negative number since a < b 
        int d = 8;
        System.out.println("Integer compare (a - d): " + (a - d));

        // int e = 1;
        // int f = -1;
        // System.out.println("Integer compare (f - e): " + (f - e));
    }
}
