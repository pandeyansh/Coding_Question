public class question38 {
    public static String convertToASCIIString(int[] asciiArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int asciiCode : asciiArray) {
            stringBuilder.append((char) asciiCode);
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        int[] asciiArray = {72, 101, 108, 108, 111, 44, 32, 119, 111, 114, 108, 100, 33};
        String resultString = convertToASCIIString(asciiArray);
        System.out.println(resultString);
    }
}