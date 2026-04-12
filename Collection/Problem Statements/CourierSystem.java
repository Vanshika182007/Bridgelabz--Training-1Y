import java.util.*;

class Parcel {
    String id;
    int priority;

    Parcel(String id, int p){ this.id=id; this.priority=p; }
}

public class CourierSystem {
    public static void main(String[] args) {
        PriorityQueue<Parcel> pq =
            new PriorityQueue<>((a,b)->b.priority-a.priority);

        Set<String> ids = new HashSet<>();
        List<Parcel> completed = new ArrayList<>();
        Queue<Parcel> normal = new LinkedList<>();

        Parcel p1 = new Parcel("C1",5);
        if (ids.add(p1.id)) pq.add(p1);

        while (!pq.isEmpty()) {
            completed.add(pq.poll());
        }

        System.out.println("Completed: " + completed.size());
    }
}