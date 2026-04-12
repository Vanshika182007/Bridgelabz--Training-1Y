import java.util.*;

public class ExamSystem {
    public static void main(String[] args) {
        Map<String, Map<String,Integer>> map = new HashMap<>();

        map.put("Math", new HashMap<>());
        map.get("Math").put("A", 90);
        map.get("Math").put("B", 80);

        for (String subject : map.keySet()) {
            int sum = 0, max = 0;
            String topper = "";

            for (Map.Entry<String,Integer> e : map.get(subject).entrySet()) {
                sum += e.getValue();
                if (e.getValue() > max) {
                    max = e.getValue();
                    topper = e.getKey();
                }
            }

            System.out.println("Topper in " + subject + ": " + topper);
            System.out.println("Avg: " + sum / map.get(subject).size());
        }
    }
}