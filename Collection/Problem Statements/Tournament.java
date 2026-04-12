import java.util.*;

class Player {
    String name;
    Player(String n){ name=n; }

    public boolean equals(Object o){
        return o instanceof Player && ((Player)o).name.equals(name);
    }
    public int hashCode(){ return name.hashCode(); }
}

class Score implements Comparable<Score> {
    String name; int points;
    Score(String n,int p){ name=n; points=p; }

    public int compareTo(Score s){
        return s.points - this.points; // descending
    }
}

public class Tournament {
    public static void main(String[] args) {
        Set<Player> players = new HashSet<>();
        Queue<String> matches = new LinkedList<>();
        List<String> results = new ArrayList<>();
        TreeSet<Score> leaderboard = new TreeSet<>();

        players.add(new Player("A"));

        matches.add("Match1");

        results.add("A wins");

        leaderboard.add(new Score("A",100));

        System.out.println(leaderboard);
    }
}