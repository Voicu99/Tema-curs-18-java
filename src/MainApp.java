import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {
        // 1. Filter even numbers
        System.out.println("1. Filter even numbers:");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

        // 2. Sort strings alphabetically
        System.out.println("\n2. Sort strings alphabetically:");
        List<String> words = Arrays.asList("banana", "apple", "orange", "kiwi");
        words.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(words);

        // 3. Calculate the sum of elements
        System.out.println("\n3. Calculate the sum of elements:");
        int sum = numbers.stream().mapToInt(n -> n).sum();
        System.out.println(sum);

        // 4. Sort list alphabetically and reverse alphabetically
        System.out.println("\n4. Sort list alphabetically and reverse alphabetically:");
        words.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("Alphabetical: " + words);
        words.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Reverse Alphabetical: " + words);

        // 5. Find maximum value
        System.out.println("\n5. Find maximum value:");
        MaxFinder maxFinder = list -> list.isEmpty() ? Optional.empty() : Optional.of(Collections.max(list));
        System.out.println(maxFinder.findMax(numbers).orElse(null));

        // 6. Custom comparator for string length
        System.out.println("\n6. Custom comparator for string length:");
        StringComparator comparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        System.out.println(comparator.compare("apple", "banana"));

        // 7. Return first n characters of a string
        System.out.println("\n7. Return first n characters of a string:");
        StringCutter cutter = (s, n) -> s.length() < n ? s : s.substring(0, n);
        System.out.println(cutter.cut("HelloWorld", 5));

        // 8. Apply function to list
        System.out.println("\n8. Apply function to list:");
        ListMapper mapper = (list, function) -> list.stream()
                .map(function)
                .collect(Collectors.toList());
        List<Integer> squared = mapper.map(numbers, x -> x * x);
        System.out.println(squared);

        // 9. Filter odd numbers
        System.out.println("\n9. Filter odd numbers:");
        OddNumberFilter oddFilter = list -> list.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(oddFilter.filterOdds(numbers));

        // 10. Convert names to uppercase
        System.out.println("\n10. Convert names to uppercase:");
        NameFormatter formatter = names -> names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        List<String> names = List.of("Alice", "Bob", "Charlie");
        System.out.println(formatter.format(names));

        // 11. Check if item is in list
        System.out.println("\n11. Check if item is in list:");
        ItemChecker<String> checker = (list, item) -> list.contains(item);
        System.out.println(checker.contains(words, "banana"));
        System.out.println(checker.contains(words, "grape"));

        // 12. Join two strings
        System.out.println("\n12. Join two strings:");
        StringJoiner joiner = (s1, s2) -> s1 + " " + s2;
        System.out.println(joiner.join("Hello", "World"));

        // 13. Calculate square root
        System.out.println("\n13. Calculate square root:");
        SquareRootCalculator sqrtCalc = Math::sqrt;
        System.out.println(sqrtCalc.calculate(16));

        // 14. Create pair of values
        System.out.println("\n14. Create pair of values:");
        PairMaker<String, Integer> pairMaker = Pair::new;
        Pair<String, Integer> pair = pairMaker.makePair("Age", 30);
        System.out.println(pair);

        // 15. Filter list with predicate
        System.out.println("\n15. Filter list with predicate:");
        ListFilter<Integer> intFilter = (list, pred) -> list.stream()
                .filter(pred)
                .collect(Collectors.toList());
        List<Integer> evens = intFilter.filter(numbers, n -> n % 2 == 0);
        System.out.println(evens);

        ListFilter<String> stringFilter = (list, pred) -> list.stream()
                .filter(pred)
                .collect(Collectors.toList());
        List<String> startsWithA = stringFilter.filter(names, name -> name.startsWith("A"));
        System.out.println(startsWithA);
    }

    // Functional interfaces and helper classes

    @FunctionalInterface
    interface MaxFinder {
        Optional<Integer> findMax(List<Integer> list);
    }

    @FunctionalInterface
    interface StringComparator {
        int compare(String s1, String s2);
    }

    @FunctionalInterface
    interface StringCutter {
        String cut(String s, int n);
    }

    @FunctionalInterface
    interface ListMapper {
        List<Integer> map(List<Integer> list, Function<Integer, Integer> function);
    }

    @FunctionalInterface
    interface OddNumberFilter {
        List<Integer> filterOdds(List<Integer> list);
    }

    @FunctionalInterface
    interface NameFormatter {
        List<String> format(List<String> names);
    }

    @FunctionalInterface
    interface ItemChecker<T> {
        boolean contains(List<T> list, T item);
    }

    @FunctionalInterface
    interface StringJoiner {
        String join(String s1, String s2);
    }

    @FunctionalInterface
    interface SquareRootCalculator {
        double calculate(double value);
    }

    @FunctionalInterface
    interface PairMaker<T, U> {
        Pair<T, U> makePair(T first, U second);
    }

    @FunctionalInterface
    interface ListFilter<T> {
        List<T> filter(List<T> list, Predicate<T> predicate);
    }

    static class Pair<T, U> {
        private T first;
        private U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "(" + first + ", " + second + ")";
        }
    }
}
