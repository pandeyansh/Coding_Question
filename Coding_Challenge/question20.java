import java.util.Arrays;
public class question20 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(arr));
        rotateLeft(arr);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
    public static void rotateLeft(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
    }
}