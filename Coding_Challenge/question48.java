public class question48 {
    public static String findLongestWord(String str) {
        String[] words = str.split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        String longestWord = findLongestWord(sentence);
        System.out.println("Longest word: " + longestWord);
    }
}