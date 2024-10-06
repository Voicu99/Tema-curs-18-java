@FunctionalInterface
interface StringCutter {
    String cut(String s, int n);
}

public class FirstNCharacters {
    public static void main(String[] args) {
        StringCutter cutter = (s, n) -> s.length() < n ? s : s.substring(0, n);

        System.out.println(cutter.cut("HelloWorld", 5));
        System.out.println(cutter.cut("Java", 10));
    }
}

