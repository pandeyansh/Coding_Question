import java.util.Arrays;
public class question47 {
    public static Object[] deepCopy(Object[] arr) {
        Object[] copy = new Object[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Object[]) {
                copy[i] = deepCopy((Object[]) arr[i]);
            } else {
                copy[i] = arr[i];
            }
        }
        return copy;
    }
    public static void main(String[] args) {
        Object[] jaggedArray = {1, 2, new Object[]{3, 4, new Object[]{5, 6}}, 7};
        Object[] copiedArray = deepCopy(jaggedArray);
        jaggedArray[2] = null;
        System.out.println("Original array: " + Arrays.deepToString(jaggedArray));
        System.out.println("Copied array: " + Arrays.deepToString(copiedArray));
    }
}