class ComparingStrings {
    public static void main(String[] args) {
        // String comparison
        System.out.println("Comparing Strings: ");
        String s1 = "apple";
        String s2 = "banana";
        // Negative number since apple < banana ("a" comes before "b")
        System.out.println("String compare: " + s1.compareTo(s2));

        // Will we get positive, negative or 0 for the examples below?
        System.out.println(s1.compareTo("abra"));
        System.out.println(s1.compareTo("apple"));
        System.out.println(s1.compareTo("giraffe"));

    }
}
