import java.util.List;

@FunctionalInterface
interface ItemChecker<T> {
    boolean contains(List<T> list, T item);
}

public class GenericItemChecker {
    public static void main(String[] args) {
        ItemChecker<String> checker = (list, item) -> list.contains(item);

        List<String> words = List.of("apple", "banana", "orange");
        System.out.println(checker.contains(words, "banana"));
        System.out.println(checker.contains(words, "grape"));
    }
}

