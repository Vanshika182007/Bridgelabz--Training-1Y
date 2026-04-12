import java.util.*;

class Movie {
    String name, genre;

    Movie(String n, String g){ name=n; genre=g; }
}

public class StreamingSystem {
    public static void main(String[] args) {
        Stack<Movie> history = new Stack<>();
        List<Movie> all = new ArrayList<>();
        Set<String> genres = new HashSet<>();
        Queue<Movie> next = new LinkedList<>();

        Movie m = new Movie("Movie1","Action");

        next.add(m);
        Movie watched = next.poll();

        history.push(watched);
        genres.add(watched.genre);

        System.out.println("Genres: " + genres);
    }
}