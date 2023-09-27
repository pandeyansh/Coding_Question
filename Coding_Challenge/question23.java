public class question23 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversedString = reverseString(str);
        System.out.println(reversedString);
    }
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }
}