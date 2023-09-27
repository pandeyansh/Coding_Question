public class question32 {
    public static String capitalizeFirstLetter(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        StringBuilder result = new StringBuilder();
        String[] words = text.trim().split("\\s+");
        for (String word : words) {
            if (!word.isEmpty()) {
                char firstLetter = Character.toUpperCase(word.charAt(0));
                String capitalizedWord = firstLetter + word.substring(1);
                result.append(capitalizedWord).append(" ");
            }
        }
        return result.toString().trim();
    }
    public static void main(String[] args) {
        String text = "this is a sample text.";
        String capitalizedText = capitalizeFirstLetter(text);
        System.out.println("Capitalized text: " + capitalizedText);
    }
}