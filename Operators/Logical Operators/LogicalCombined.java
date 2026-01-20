public class LogicalCombined {
    public static void main(String[] args) {
        int score = 85;
        boolean passed = (score >= 50) && (score <= 100);
        boolean failed = !passed;

        System.out.println(passed);
        System.out.println(failed);
    }
}