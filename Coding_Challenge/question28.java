import java.util.Arrays;
public class question28 {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int[] getFirst100Primes() {
        int[] primes = new int[100];
        int count = 0;
        int sum = 0;
        int num = 2;
        while (count < 100) {
            if (isPrime(num)) {
                primes[count] = num;
                sum += num;
                count++;
            }
            num++;
        }
        System.out.println("Sum of the first 100 prime numbers: " + sum);
        return primes;
    }
    public static void main(String[] args) {
        int[] primeNumbers = getFirst100Primes();
        System.out.println("Prime numbers array: " + Arrays.toString(primeNumbers));
    }
}