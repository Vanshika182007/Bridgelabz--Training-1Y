import java.util.*;

class Order {
    int id;
    String name;

    Order(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object o) {
        return o instanceof Order && ((Order)o).id == this.id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() { return id + " " + name; }
}

public class ECommerceSystem {
    public static void main(String[] args) {
        List<Order> allOrders = new ArrayList<>();
        Set<Order> uniqueOrders = new HashSet<>();
        Queue<Order> queue = new LinkedList<>();
        Stack<Order> failed = new Stack<>();

        // Add orders
        allOrders.add(new Order(1,"A"));
        allOrders.add(new Order(2,"B"));
        allOrders.add(new Order(1,"Duplicate"));

        // Remove duplicates
        uniqueOrders.addAll(allOrders);

        // Process
        queue.addAll(uniqueOrders);

        while (!queue.isEmpty()) {
            Order o = queue.poll();
            if (o.id % 2 == 0) { // simulate failure
                failed.push(o);
            } else {
                System.out.println("Processed: " + o);
            }
        }

        // Retry failed
        while (!failed.isEmpty()) {
            System.out.println("Retry: " + failed.pop());
        }
    }
}