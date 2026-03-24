class Item {
    int itemCode;
    String itemName;
    double price;

    // Method to display item details
    void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per item: " + price);
    }

    // Method to calculate total cost
    void calculateTotalCost(int quantity) {
        double total = price * quantity;
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        Item obj = new Item();

        obj.itemCode = 1001;
        obj.itemName = "Laptop";
        obj.price = 50000;

        obj.displayItem();
        obj.calculateTotalCost(2);
    }
}
