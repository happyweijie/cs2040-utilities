class Test {
    public static void main(String[] args) {
        // 2 names
        String name1 = "Aaron Aaronson";
        String name2 = "Ada Lovelace";

         // s.substring(i, j) returns a substring of String s starting from index i to j-1
         // In this case we want to get the letters at index 0 and 1 of each name
        String first = name1.substring(0, 2); // Aa
        String second = name2.substring(0, 2); // Ad
        
        int comp = first.compareTo(second);

        System.out.println(comp);
    }
}