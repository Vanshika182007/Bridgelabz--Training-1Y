public class Game {
    public static void main(String[] args) {
        Integer[] scores = {100, null, 200, null, 150};

        int notPlayed = 0;
        int total = 0;

        for (Integer score : scores) {
            if (score == null) {
                notPlayed++;
            } else {
                total += score; // auto-unboxing
            }
        }

        System.out.println("Not Played: " + notPlayed);
        System.out.println("Total Score: " + total);
    }
}