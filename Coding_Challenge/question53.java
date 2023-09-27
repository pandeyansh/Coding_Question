import java.math.BigInteger;
public class question53 {
    public static BigInteger calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 70;
        BigInteger factorial = calculateFactorial(n);
        System.out.println(n + "!:");
        System.out.println(factorial);
    }
}