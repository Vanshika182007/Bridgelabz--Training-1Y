import java.util.*;

public class Marks {
    public static void main(String[] args) {
        Object[] inputs = {"85", 95, Integer.valueOf(88), "null", "abc"};

        ArrayList<Integer> valid = new ArrayList<>();

        for (Object obj : inputs) {
            try {
                if (obj instanceof Integer) {
                    valid.add((Integer) obj);
                } else if (obj instanceof String) {
                    String str = (String) obj;
                    if (!str.equals("null")) {
                        valid.add(Integer.parseInt(str));
                    }
                }
            } catch (Exception e) {
                // ignore invalid
            }
        }

        int sum = 0;
        for (int x : valid) sum += x;

        System.out.println("Average = " + (sum / (double) valid.size()));
    }
}