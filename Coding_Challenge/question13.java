public class question13 {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 2, 1, 7, 3};
        int max = numbers[0]; 
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; 
            }
        }
        System.out.println("The maximum number is: " + max);
    }
}