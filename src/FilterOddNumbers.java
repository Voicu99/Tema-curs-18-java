import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface OddNumberFilter {
    List<Integer> filterOdds(List<Integer> list);
}

public class FilterOddNumbers {
    public static void main(String[] args) {
        OddNumberFilter oddFilter = list -> list.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(oddFilter.filterOdds(numbers));
    }
}

