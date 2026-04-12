import java.util.*;

public class Library {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("101", "Java");
        map.put("102", "Python");

        // Search
        System.out.println(map.getOrDefault("101", "Not Found"));

        // Remove
        map.remove("102");

        // Sort
        Map<String, String> sorted = new TreeMap<>(map);
        System.out.println(sorted);

        // Search by title
        for (Map.Entry<String,String> e : map.entrySet()) {
            if (e.getValue().equalsIgnoreCase("Java"))
                System.out.println("Found ISBN: " + e.getKey());
        }
    }
}