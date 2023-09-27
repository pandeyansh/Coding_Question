public class question44 {
    public static int convertBinaryToNumber(String binary) {
        int number = 0;
        int length = binary.length();
        for (int i = length - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                number += Math.pow(2, length - 1 - i);
            }
        }
        return number;
    }
    public static void main(String[] args) {
        String binary = "101010";
        int number = convertBinaryToNumber(binary);
        System.out.println("Number: " + number);
    }
}