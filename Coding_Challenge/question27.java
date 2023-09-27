import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class question27 {
    public static int[] getDistinctElements(int[] numbers) {
        Set<Integer> distinctSet = new HashSet<>();
        for (int num : numbers) {
            distinctSet.add(num);
        }
        int[] distinctArray = new int[distinctSet.size()];
        int index = 0;
        for (int num : distinctSet) {
            distinctArray[index] = num;
            index++;
        }
        return distinctArray;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 1, 2, 3, 6, 7, 8, 9, 9};
        int[] distinctNumbers = getDistinctElements(numbers);
        System.out.println("Original numbers array: " + Arrays.toString(numbers));
        System.out.println("Distinct numbers array: " + Arrays.toString(distinctNumbers));
    }
}