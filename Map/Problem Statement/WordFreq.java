import java.util.*;

public class WordFreq {
    public static void main(String[] args) {
        String text = "Java is fun and Java is powerful";

        text = text.toLowerCase().replaceAll("[^a-z ]", "");
        String[] words = text.split(" ");

        Map<String,Integer> map = new HashMap<>();

        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        System.out.println(map);
    }
}