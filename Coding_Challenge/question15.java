import java.util.Scanner;
public class question15 {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fibNumber = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + fibNumber);
        sc.close();
    }
}