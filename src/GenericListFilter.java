import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@FunctionalInterface
interface ListFilter<T> {
    List<T> filter(List<T> list, Predicate<T> predicate);
}

public class GenericListFilter {
    public static void main(String[] args) {
        ListFilter<Integer> intFilter = (list, pred) -> list.stream()
                .filter(pred)
                .collect(Collectors.toList());

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> evens = intFilter.filter(numbers, n -> n % 2 == 0);
        System.out.println(evens);

        ListFilter<String> stringFilter = (list, pred) -> list.stream()
                .filter(pred)
                .collect(Collectors.toList());

        List<String> names = List.of("Alice", "Bob", "Charlie");
        List<String> startsWithA = stringFilter.filter(names, name -> name.startsWith("A"));
        System.out.println(startsWithA);
    }
}

