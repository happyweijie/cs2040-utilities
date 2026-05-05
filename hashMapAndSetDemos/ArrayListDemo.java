import java.util.ArrayList;

class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // adding to array list
        list.add("Ada");
        list.add("Bryan");
        list.add("Timothee");
        list.add("Olivia");

        System.out.println(list);
        
        // Iterate through array list (2 methods)
        for (int i = 0; i < list.size(); i++) { // for i in range(len(list)
            System.out.println(list.get(i));
        }

        for (String name : list) { // for name in list
            System.out.println(name);
        }
    }
}
