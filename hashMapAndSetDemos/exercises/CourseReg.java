import java.util.*;

/**
 * You are given an array of course registrations (course, name) 
 * where some students accidentally registered for the same course multiple times.
 * 
 * Count the number of unique students registered for each course.
 */
class CourseReg {
    public static void main(String[] args) {
        String[][] data = {
            {"CS1231", "Ada"},
            {"CS1010", "Ada"},
            {"CS1010", "Bob"},
            {"CS1010", "Ada"},
            {"CS2030", "Charlie"},
            {"CS2030", "John"},
            {"CS2040", "David"},
            {"CS2040", "John"},
            {"CS2040", "David"},
            {"CS2040", "Edsger"},
        };

        // Replace the question marks with the appropriate types
        HashMap<?, ?> courseReg = new HashMap<>();

        for (String[] row : data) {
            String course = row[0];
            String student = row[1];

            // TODO
        }

        // Print the number of unique students for each course
        // Use the format "course: number_of_students"
    }
}
