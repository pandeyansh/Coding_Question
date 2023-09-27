public class question11 {
    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10 };
        double average = calculateAverage(numbers);
        System.out.println("Average: " + average);
    }
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum = sum + number;
        }
        return (double) sum / array.length;
    }
}