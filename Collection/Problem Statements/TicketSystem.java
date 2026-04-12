import java.util.*;

class Booking {
    String name;
    boolean vip;

    Booking(String name, boolean vip) {
        this.name = name;
        this.vip = vip;
    }
}

public class TicketSystem {
    public static void main(String[] args) {
        List<Booking> bookings = new ArrayList<>();
        Set<String> users = new HashSet<>();
        Queue<Booking> queue = new LinkedList<>();

        PriorityQueue<Booking> vipQueue =
            new PriorityQueue<>((a,b) -> Boolean.compare(b.vip, a.vip));

        Booking b1 = new Booking("User1", false);
        Booking b2 = new Booking("User2", true);

        if (users.add("User1")) queue.add(b1);
        if (users.add("User2")) queue.add(b2);

        vipQueue.addAll(queue);

        while (!vipQueue.isEmpty()) {
            Booking b = vipQueue.poll();
            bookings.add(b);
            System.out.println("Confirmed: " + b.name);
        }
    }
}