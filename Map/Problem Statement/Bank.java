import java.util.*;

public class Bank {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();

        map.put("A1", 5000.0);
        map.put("A2", 8000.0);

        // deposit
        map.put("A1", map.get("A1")+2000);

        // withdraw
        if (map.get("A2") >= 3000)
            map.put("A2", map.get("A2")-3000);

        // sort desc
        List<Map.Entry<String,Double>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)->Double.compare(b.getValue(), a.getValue()));

        System.out.println(list);

        // top 3
        for (int i=0;i<Math.min(3,list.size());i++)
            System.out.println(list.get(i));
    }
}