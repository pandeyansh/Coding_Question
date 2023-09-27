import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
public class question50 {
    public static int[] generateRandomNumbers(int n) {
        int[] numbers = new int[n];
        List<Integer> numberList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numberList.add(i);
        }
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int randomIndex = rand.nextInt(numberList.size());
            numbers[i] = numberList.get(randomIndex);
            numberList.remove(randomIndex);
        }
        return numbers;
    }
    public static void main(String[] args) {
        int n = 10;
        int[] randomNumbers = generateRandomNumbers(n);
        System.out.println(Arrays.toString(randomNumbers));
    }
}