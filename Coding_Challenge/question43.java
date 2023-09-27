public class question43 {
    public static int[] extractColumn(int[][] matrix, int columnNumber) {
        int numRows = matrix.length;
        int[] column = new int[numRows];
        for (int i = 0; i < numRows; i++) {
            column[i] = matrix[i][columnNumber];
        }
        return column;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int columnNumber = 1;
        int[] extractedColumn = extractColumn(matrix, columnNumber);
        System.out.println("Extracted column:");
        for (int value : extractedColumn) {
            System.out.println(value);
        }
    }
}