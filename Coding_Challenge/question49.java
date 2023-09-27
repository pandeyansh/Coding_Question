import java.util.Arrays;
import java.util.Collections;
public class question49 {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cherry", "date", "elderberry"};
        System.out.println("Original array: " + Arrays.toString(strings));
        Collections.shuffle(Arrays.asList(strings));
        System.out.println("Shuffled array: " + Arrays.toString(strings));
    }
}