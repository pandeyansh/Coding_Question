public class question21 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        rotateRight(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    public static void rotateRight(int[] arr) {
        int last = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = last;
    }
}