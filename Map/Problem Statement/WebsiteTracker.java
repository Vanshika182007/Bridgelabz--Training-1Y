import java.util.*;

public class WebsiteTracker {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        String[] pages = {"home","about","products","home","products","contact","home"};

        for (String p : pages) {
            map.put(p, map.getOrDefault(p,0)+1);
        }

        // sort descending
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());

        System.out.println(list);
        System.out.println("Top: " + list.get(0).getKey());
    }
}