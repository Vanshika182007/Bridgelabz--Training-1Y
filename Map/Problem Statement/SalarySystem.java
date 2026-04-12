import java.util.*;

public class SalarySystem {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();

        map.put("A", 50000.0);
        map.put("B", 70000.0);

        // raise
        if (map.containsKey("A"))
            map.put("A", map.get("A") * 1.1);

        double sum = 0;
        double max = 0;

        for (double v : map.values()) {
            sum += v;
            if (v > max) max = v;
        }

        System.out.println("Avg: " + sum/map.size());

        for (String k : map.keySet()) {
            if (map.get(k) == max)
                System.out.println("Top: " + k);
        }
    }
}