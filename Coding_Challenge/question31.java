public class question31 {
    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] words = text.trim().split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        String text = "This is a sample text.";
        int wordCount = countWords(text);
        System.out.println("Number of words: " + wordCount);
    }
}