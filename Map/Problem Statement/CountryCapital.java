import java.util.*;

public class CountryCapital {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("India","Delhi");
        map.put("USA","Washington");

        Scanner sc = new Scanner(System.in);
        String country = sc.nextLine();

        System.out.println(map.getOrDefault(country, "Unknown country"));

        Map<String,String> sorted = new TreeMap<>(map);
        System.out.println(sorted);
    }
}