import java.util.Arrays;
public class question24 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] mergedArray = mergeArrays(array1, array2);
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
    public static int[] mergeArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int[] mergedArray = new int[length1 + length2];
        System.arraycopy(array1, 0, mergedArray, 0, length1);
        System.arraycopy(array2, 0, mergedArray, length1, length2);
        return mergedArray;
    }
}