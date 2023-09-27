import java.util.ArrayList;
import java.util.HashSet;
public class question25 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {3, 4, 5, 6};
        int[] mergedArray = mergeArrays(array1, array2);
        System.out.print("Merged Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
    public static int[] mergeArrays(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int num : array1) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }
        for (int num : array2) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }
        resultList.addAll(set);
        int[] mergedArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            mergedArray[i] = resultList.get(i);
        }
        return mergedArray;
    }
}