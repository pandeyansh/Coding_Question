public class question45 {
    public static int calculateSum(Object[] arr) {
        int sum = 0;
        for (Object element : arr) {
            if (element instanceof Integer) {
                sum = sum + (Integer) element;
            } else if (element instanceof Object[]) {
                sum = sum + calculateSum((Object[]) element);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Object[] jaggedArray = {1, 2, new Object[]{3, 4, new Object[]{5}}, 6};
        int sum = calculateSum(jaggedArray);
        System.out.println("Sum: " + sum);
    }
}