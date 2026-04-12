import java.util.*;

class RideRequest {
    int priority;
    String name;

    RideRequest(String n, int p){ name=n; priority=p; }
}

class Driver {
    String name;
    Driver(String n){ name=n; }
}

public class RideSystem {
    public static void main(String[] args) {
        Queue<RideRequest> normal = new LinkedList<>();
        PriorityQueue<RideRequest> priorityQ =
            new PriorityQueue<>((a,b)->b.priority-a.priority);

        Set<Driver> drivers = new HashSet<>();
        List<String> completed = new ArrayList<>();

        drivers.add(new Driver("D1"));

        priorityQ.add(new RideRequest("R1",5));
        priorityQ.add(new RideRequest("R2",2));

        while (!priorityQ.isEmpty()) {
            System.out.println("Assigned: " + priorityQ.poll().name);
        }
    }
}