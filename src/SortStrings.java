import java.util.Arrays;
import java.util.List;

public class SortStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "orange", "kiwi");
        words.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(words);
    }
}
