import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface NameFormatter {
    List<String> format(List<String> names);
}

public class UpperCaseNames {
    public static void main(String[] args) {
        NameFormatter formatter = names -> names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        List<String> names = List.of("Alice", "Bob", "Charlie");
        System.out.println(formatter.format(names));
    }
}

