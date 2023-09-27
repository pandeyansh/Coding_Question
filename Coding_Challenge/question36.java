public class question36 {
    public static char[] convertStringToArray(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        char[] resultArray = convertStringToArray(inputString);
        for (char c : resultArray) {
            System.out.println(c);
        }
    }
}