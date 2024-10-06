import java.util.Arrays;
import java.util.List;

public class SortWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "orange", "kiwi");

        // Alphabetical order
        words.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("Alphabetical: " + words);

        // Reverse alphabetical order
        words.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Reverse Alphabetical: " + words);
    }
}
