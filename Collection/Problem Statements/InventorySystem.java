import java.util.*;

class Product {
    String name;
    int stock;

    Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public String toString() {
        return name + " (Stock: " + stock + ")";
    }
}

public class InventorySystem {
    public static void main(String[] args) {
        Set<String> productNames = new HashSet<>();
        List<Product> products = new ArrayList<>();
        Queue<Product> restockQueue = new LinkedList<>();
        Stack<Product> restocked = new Stack<>();

        Product p1 = new Product("Milk", 2);
        Product p2 = new Product("Bread", 10);

        // Add products
        if (productNames.add(p1.name)) products.add(p1);
        if (productNames.add(p2.name)) products.add(p2);

        // Low stock
        for (Product p : products) {
            if (p.stock < 5) restockQueue.add(p);
        }

        // Restock
        while (!restockQueue.isEmpty()) {
            Product p = restockQueue.poll();
            p.stock += 10;
            restocked.push(p);
            System.out.println("Restocked: " + p);
        }

        // Undo restock
        if (!restocked.isEmpty()) {
            Product p = restocked.pop();
            p.stock -= 10;
            System.out.println("Undo Restock: " + p);
        }
    }
}