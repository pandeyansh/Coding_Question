import java.util.Arrays;
public class question37 {
    public static int[] convertToASCIIArray(String input) {
        int[] asciiArray = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            asciiArray[i] = (int) input.charAt(i);
        }
        return asciiArray;
    }
    public static void main(String[] args) {
        String inputString = "Hello, world!";
        int[] asciiArray = convertToASCIIArray(inputString);
        System.out.println(Arrays.toString(asciiArray));
    }
}