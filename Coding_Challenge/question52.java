import java.math.BigInteger;
public class question52 {
    public static BigInteger calculateFibonacci(int n) {
        if (n <= 1) {
            return BigInteger.valueOf(n);
        }
        BigInteger prev = BigInteger.ZERO;
        BigInteger curr = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            BigInteger next = prev.add(curr);
            prev = curr;
            curr = next;
        }
        return curr;
    }
    public static void main(String[] args) {
        int n = 500;
        BigInteger fibonacci = calculateFibonacci(n);
        System.out.println("Fibonacci(" + n + "):");
        System.out.println(fibonacci);
    }
}