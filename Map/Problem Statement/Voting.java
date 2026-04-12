import java.util.*;

public class Voting {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();

        String[] input = {"A","B","A","C","B","A","C","A","B","A"};

        for (String v : input) {
            votes.put(v, votes.getOrDefault(v, 0) + 1);
        }

        String winner = "";
        int max = 0;

        for (String k : votes.keySet()) {
            if (votes.get(k) > max) {
                max = votes.get(k);
                winner = k;
            }
        }

        System.out.println("Winner: " + winner);
        System.out.println(votes);
    }
}