import java.util.ArrayList;
import java.util.List;
public class question19 {
    public static int[] getPrimes(int n, int p) {
        List<Integer> primes = new ArrayList<>();
        int currentNumber = n + 1;
        while (primes.size() < p) {
            if (isPrime(currentNumber)) {
                primes.add(currentNumber);
            }
            currentNumber++;
        }
        int[] primeArray = new int[p];
        for (int i = 0; i < p; i++) {
            primeArray[i] = primes.get(i);
        }
        return primeArray;
    }
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 10;
        int p = 5;
        int[] primeNumbers = getPrimes(n, p);
        System.out.println("The first " + p + " prime numbers greater than " + n + " are:");
        for (int prime : primeNumbers) {
            System.out.println(prime);
        }
    }
}