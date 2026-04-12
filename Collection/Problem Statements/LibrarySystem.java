import java.util.*;

class Book {
    String name;
    Book(String n){ name=n; }
    public String toString(){ return name; }
}

public class LibrarySystem {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Set<String> members = new HashSet<>();
        Queue<Book> issueQueue = new LinkedList<>();
        Stack<Book> returned = new Stack<>();

        books.add(new Book("Java"));

        members.add("M1");

        issueQueue.add(books.get(0));

        Book issued = issueQueue.poll();
        returned.push(issued);

        System.out.println("Reissue: " + returned.pop());
    }
}