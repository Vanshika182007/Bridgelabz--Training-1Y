import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();

        // Add
        map.put("Aman", 85.5);
        map.put("Riya", 90.0);

        // Update
        map.put("Aman", 88.0);

        // Remove
        map.remove("Riya");

        // Sort by key
        Map<String, Double> sorted = new TreeMap<>(map);

        for (Map.Entry<String, Double> e : sorted.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}