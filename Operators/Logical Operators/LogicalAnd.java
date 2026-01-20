public class LogicalAnd {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        boolean result = (a < b) && (b < c);
        System.out.println(result);

        boolean result2 = (a > b) && (b < c);
        System.out.println(result2);
    }
}