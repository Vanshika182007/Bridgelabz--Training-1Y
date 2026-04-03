import java.util.*;

public class EmployeeData5 {
    public static void main(String[] args) {
        int[] ages = {25, 30, 19, 45, 22};

        // Convert int[] to ArrayList<Integer>
        ArrayList<Integer> ageList = new ArrayList<>();
        for (int age : ages) {
            ageList.add(age); // auto-boxing
        }

        // Find youngest and oldest
        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);

        System.out.println("Youngest Age: " + youngest);
        System.out.println("Oldest Age: " + oldest);
    }
}