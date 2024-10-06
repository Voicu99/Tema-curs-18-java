@FunctionalInterface
interface StringComparator {
    int compare(String s1, String s2);
}

public class CompareByLength {
    public static void main(String[] args) {
        StringComparator comparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        System.out.println(comparator.compare("apple", "banana"));
        System.out.println(comparator.compare("kiwi", "pear"));
    }
}

