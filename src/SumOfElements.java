import java.util.Arrays;
import java.util.List;

public class SumOfElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().mapToInt(n -> n).sum();
        System.out.println(sum);
    }
}
