import java.util.function.Predicate;

public class DivisiblePredicateFactory {

    public static Predicate<Integer> divisibleBy(Integer divisor) {
        return n -> n % divisor == 0;
    }

}
