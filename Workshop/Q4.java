import java.util.*;

public class PrimeNumbers {
    public static List<Integer> getPrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) primes.add(i);
        }
        return primes;
    }

    private static boolean isPrime(int num) {
        if (num<2) return false;
        for (int i=2; i<= Math.sqrt(num); i++) {
            if (num%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println(getPrimes(n));
    }
}