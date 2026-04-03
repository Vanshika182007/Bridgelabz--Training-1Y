import java.util.*;

public class Ratings {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(null);
        list.add(4);

        ArrayList<Integer> combined = new ArrayList<>();

        for (int x : arr) combined.add(x); // auto-boxing
        combined.addAll(list);

        int sum = 0, count = 0;

        for (Integer r : combined) {
            if (Objects.nonNull(r)) {
                sum += r;
                count++;
            }
        }

        System.out.println("Average = " + (sum / (double) count));
    }
}