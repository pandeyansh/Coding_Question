public class question29 {
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
    public static void main(String[] args) {
        int count = 0;
        int previousPrime = 0;
        for (int i = 2; count < 100; i++) {
            if (isPrime(i)) {
                if (count > 0) {
                    int distance = i - previousPrime;
                    System.out.println("Distance between " + previousPrime + " and " + i + ": " + distance);
                }
                previousPrime = i;
                count++;
            }
        }
    }
}