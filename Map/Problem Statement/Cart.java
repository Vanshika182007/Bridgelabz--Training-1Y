import java.util.*;

public class Cart {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> cart = new LinkedHashMap<>();

        cart.put("TV", 4000.0);
        cart.put("Phone", 2000.0);

        double total = 0;
        for (double v : cart.values()) total += v;

        if (total > 5000) total *= 0.9;

        System.out.println("Total: " + total);
    }
}