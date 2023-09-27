import java.util.Arrays;
public class question34 {
    public static String[] extractWords(String text) {
        text = text.trim().replaceAll("[^a-zA-Z ]", "");
        String[] words = text.split("\\s+");
        return words;
    }
    public static void main(String[] args) {
        String text = "This is a sample text. It contains multiple words.";
        String[] words = extractWords(text);
        System.out.println(Arrays.toString(words));
    }
}