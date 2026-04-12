class Product<T> {
    T category;
    double price;

    public Product(T category, double price) {
        this.category = category;
        this.price = price;
    }
}

public class DiscountUtil {
    public static <T extends Product<?>> void applyDiscount(T product, double percent) {
        product.price -= product.price * percent / 100;
    }
}