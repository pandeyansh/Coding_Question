public class question10 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int sum = calculateSum(numbers);
        System.out.println("Sum: " + sum);
    }
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }
        return sum;
    }
}