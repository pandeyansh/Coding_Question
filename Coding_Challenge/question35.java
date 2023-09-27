import java.util.Arrays;
public class question35 {
    public static String[][] convertCSVToArray(String csvText, String[] rows) {
        int rowCount = rows.length;
        int colCount = rows[0].split(",").length;
        String[][] array = new String[rowCount][colCount];
        for (int i = 0; i < rowCount; i++) {
            String[] columns = rows[i].split(",");
            array[i] = columns;
        }
        return array;
    }
    public static void main(String[] args) {
        String csvText = "Ansh,Pandey,25\nAnubhav,Pandey,30\nShubham,Gupta,40";
        String[] rows = csvText.split("\n");
        String[][] array = convertCSVToArray(csvText, rows);
        for (String[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}