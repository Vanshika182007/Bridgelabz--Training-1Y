import java.util.*;

public class DeptMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"IT");
        map.put(2,"HR");

        // update
        map.put(1,"Finance");

        // reverse lookup
        for (int id : map.keySet()) {
            if (map.get(id).equals("Finance"))
                System.out.println("Employee: " + id);
        }

        // count per dept
        Map<String,Integer> count = new HashMap<>();
        for (String d : map.values()) {
            count.put(d, count.getOrDefault(d,0)+1);
        }

        System.out.println(count);
    }
}