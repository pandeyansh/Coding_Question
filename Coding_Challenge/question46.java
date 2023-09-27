public class question46 {
    public static int findMax(Object[] arr) {
        int max = Integer.MIN_VALUE;
        for (Object element : arr) {
            if (element instanceof Integer) {
                int num = (Integer) element;
                max = Math.max(max, num);
            } else if (element instanceof Object[]) {
                int subArrayMax = findMax((Object[]) element);
                max = Math.max(max, subArrayMax);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Object[] jaggedArray = {1, 2, new Object[]{3, 4, new Object[]{5, 6}}, 7};
        int max = findMax(jaggedArray);
        System.out.println("Max number: " + max);
    }
}