import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@FunctionalInterface
interface ListMapper {
    List<Integer> map(List<Integer> list, Function<Integer, Integer> function);
}

public class ApplyFunction {
    public static void main(String[] args) {
        ListMapper mapper = (list, function) -> list.stream()
                .map(function)
                .collect(Collectors.toList());

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> squared = mapper.map(numbers, x -> x * x);
        System.out.println(squared);
    }
}

