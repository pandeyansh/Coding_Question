import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class question26 {
    public static int[] getArrayDifference(int[] array1, int[] array2) {
        List<Integer> difference = new ArrayList<>();
        for (int num : array1) {
            if (!contains(array2, num)) {
                difference.add(num);
            }
        }
        int[] result = new int[difference.size()];
        for (int i = 0; i < difference.size(); i++) {
            result[i] = difference.get(i);
        }
        return result;
    }
    private static boolean contains(int[] array, int num) {
        for (int i : array) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6};
        int[] difference = getArrayDifference(array1, array2);
        System.out.println("Elements in array1 but not in array2: " + Arrays.toString(difference));
    }
}