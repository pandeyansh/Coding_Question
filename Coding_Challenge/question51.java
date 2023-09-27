import java.util.HashMap;
import java.util.Map;
public class question51 {
    public static int[][] calculateLetterFrequency(String str) {
        int[][] frequencyArray;
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }
        frequencyArray = new int[frequencyMap.size()][2];
        int index = 0;
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            frequencyArray[index][0] = entry.getKey();
            frequencyArray[index][1] = entry.getValue();
            index++;
        }
        return frequencyArray;
    }
    public static void main(String[] args) {
        String input = "Hello, World!";
        int[][] letterFrequency = calculateLetterFrequency(input);
        System.out.println("Letter Frequency:");
        for (int[] entry : letterFrequency) {
            char letter = (char) entry[0];
            int frequency = entry[1];
            System.out.println(letter + ": " + frequency);
        }
    }
}