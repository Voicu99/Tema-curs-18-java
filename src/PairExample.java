class Pair<T, U> {
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

@FunctionalInterface
interface PairMaker<T, U> {
    Pair<T, U> makePair(T first, U second);
}

public class PairExample {
    public static void main(String[] args) {
        PairMaker<String, Integer> pairMaker = Pair::new;
        Pair<String, Integer> pair = pairMaker.makePair("Age", 30);
        System.out.println(pair);
    }
}

