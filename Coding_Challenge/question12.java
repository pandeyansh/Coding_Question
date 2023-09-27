import java.util.ArrayList;
import java.util.List;
public class question12 {
    public static int[] getPositiveNumbers(int[] numbers) {
        List<Integer> positiveNumbersList = new ArrayList<>();
        for (int number : numbers) {
            if (number > 0) {
                positiveNumbersList.add(number);
            }
        }
        int[] positiveNumbersArray = new int[positiveNumbersList.size()];
        for (int i = 0; i < positiveNumbersList.size(); i++) {
            positiveNumbersArray[i] = positiveNumbersList.get(i);
        }
        return positiveNumbersArray;
    }
    public static void main(String[] args) {
        int[] numbers = {-2, 5, 0, -10, 15, -7, 8};
        int[] positiveNumbers = getPositiveNumbers(numbers);
        System.out.print("Positive numbers: ");
        for (int number : positiveNumbers) {
            System.out.print(number + " ");
        }
    }
}