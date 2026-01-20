public class LogicalOr {
    public static void main(String[] args) {
        int x = 50;
        int y = 20;

        boolean result = (x > y) || (y > 100);
        System.out.println(result);

        boolean result2 = (x < y) || (y > 100);
        System.out.println(result2);
    }
}