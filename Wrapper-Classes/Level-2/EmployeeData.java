import java.util.*;

public class EmployeeData {
    public static void main(String[] args) {
        int[] ages = {25, 30, 19, 45, 22};

        ArrayList<Integer> list = new ArrayList<>();
        for (int age : ages) {
            list.add(age); // auto-boxing
        }

        System.out.println("Youngest: " + Collections.min(list));
        System.out.println("Oldest: " + Collections.max(list));
    }
}