@FunctionalInterface
interface SquareRootCalculator {
    double calculate(double value);
}

public class SquareRootExample {
    public static void main(String[] args) {
        SquareRootCalculator sqrtCalc = Math::sqrt;

        System.out.println(sqrtCalc.calculate(16));
    }
}

