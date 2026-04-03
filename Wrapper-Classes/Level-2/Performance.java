import java.util.*;

public class Performance {
    public static void main(String[] args) {
        int n = 1_000_000;

        // ArrayList<Integer>
        long start1 = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(i);

        long sum1 = 0;
        for (Integer x : list) sum1 += x;
        long end1 = System.currentTimeMillis();

        // int[]
        long start2 = System.currentTimeMillis();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i;

        long sum2 = 0;
        for (int x : arr) sum2 += x;
        long end2 = System.currentTimeMillis();

        System.out.println("ArrayList Time: " + (end1 - start1));
        System.out.println("Array Time: " + (end2 - start2));
    }
}