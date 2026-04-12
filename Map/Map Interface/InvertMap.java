import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        Map<String, Integer> input = new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);

        Map<Integer, List<String>> result = new HashMap<>();

        for (Map.Entry<String, Integer> entry : input.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            result.putIfAbsent(value, new ArrayList<>());
            result.get(value).add(key);
        }

        System.out.println(result); // {1=[A, C], 2=[B]}
    }
}