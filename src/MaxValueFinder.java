import java.util.List;
import java.util.Optional;

@FunctionalInterface
interface MaxFinder {
    Optional<Integer> findMax(List<Integer> list);
}

public class MaxValueFinder {
    public static void main(String[] args) {
        MaxFinder maxFinder = (list) -> list.isEmpty() ? Optional.empty() : Optional.of(list.stream().max(Integer::compare).get());

        List<Integer> numbers = List.of(10, 25, 30, 15);
        System.out.println("Max value: " + maxFinder.findMax(numbers).orElse(null));
    }
}
