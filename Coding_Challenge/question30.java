import java.math.BigInteger;
public class question30 {
    public static String add(String num1, String num2) {
        BigInteger bigNum1 = new BigInteger(num1);
        BigInteger bigNum2 = new BigInteger(num2);
        BigInteger sum = bigNum1.add(bigNum2);
        String result = sum.toString();
        return result;
    }
    public static void main(String[] args) {
        String num1 = "12345678901234567890";
        String num2 = "98765432109876543210";
        String sum = add(num1, num2);
        System.out.println("Sum: " + sum);
    }
}