import java.util.*;

class Team implements Comparable<Team> {
    String name;
    int points;

    Team(String n, int p){ name=n; points=p; }

    public int compareTo(Team t){
        return t.points - this.points;
    }

    public String toString(){ return name + " " + points; }
}

public class SportsSystem {
    public static void main(String[] args) {
        Set<Team> teams = new HashSet<>();
        Queue<String> matches = new LinkedList<>();
        List<String> results = new ArrayList<>();
        TreeSet<Team> leaderboard = new TreeSet<>();

        Team t = new Team("A",10);
        teams.add(t);

        matches.add("Match1");

        results.add("A won");

        leaderboard.add(t);

        System.out.println("Leaderboard: " + leaderboard);
    }
}