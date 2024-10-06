@FunctionalInterface
interface StringJoiner {
    String join(String s1, String s2);
}

public class JoinStrings {
    public static void main(String[] args) {
        StringJoiner joiner = (s1, s2) -> s1 + " " + s2;

        System.out.println(joiner.join("Hello", "World"));
    }
}

