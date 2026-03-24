class CartItem {
    String itemName;
    double price;
    int quantity;

    // Add item
    void addItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
    }

    // Remove item
    void removeItem() {
        itemName = "";
        price = 0;
        quantity = 0;
        System.out.println("Item removed from cart.");
    }

    // Display total cost
    void displayTotal() {
        double total = price * quantity;
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        CartItem c = new CartItem();
        c.addItem("Shoes", 2000, 2);
        c.displayTotal();
        c.removeItem();
    }
}
