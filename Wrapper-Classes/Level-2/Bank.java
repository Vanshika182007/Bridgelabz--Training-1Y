public class Bank {

    public static double remainingLimit(Double limit, double used) {
        if (limit == null) {
            return 0.0;
        }
        return limit - used;
    }

    public static void main(String[] args) {
        System.out.println(remainingLimit(5000.0, 1500)); // 3500
        System.out.println(remainingLimit(null, 1000));   // 0.0
    }
}