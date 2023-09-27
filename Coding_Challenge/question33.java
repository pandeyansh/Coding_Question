public class question33 {
    public static int calculateSum(String input) {
        String[] numbers = input.split(",");
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number.trim());
        }
        return sum;
    }
    public static void main(String[] args) {
        String input = "1,2,3,4,5";
        int sum = calculateSum(input);
        System.out.println("Sum: " + sum);
    }
}