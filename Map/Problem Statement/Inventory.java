import java.util.*;

public class Inventory {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();

        // Add
        stock.put("Milk", 10);
        stock.put("Bread", 5);

        // Buy
        stock.put("Milk", stock.get("Milk") - 10);

        // Restock
        stock.put("Bread", stock.get("Bread") + 5);

        // Query
        System.out.println(stock.getOrDefault("Milk", 0));

        // Out of stock
        for (String k : stock.keySet()) {
            if (stock.get(k) <= 0)
                System.out.println(k + " is out of stock");
        }
    }
}