import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args) {
        Operator operator = new Operator();

        Predicate<Integer> divisibleBy3 = DivisiblePredicateFactory.divisibleBy(3);
        Predicate<Integer> divisibleBy5 = DivisiblePredicateFactory.divisibleBy(5);

        Operation fizzbuzz = new Operation(new Specification(divisibleBy3).and(divisibleBy5), "FizzBuzz");
        Operation fizz = new Operation(new Specification(divisibleBy3), "Fizz");
        Operation buzz = new Operation(new Specification(divisibleBy5), "Buzz");

        operator.addOperation(fizzbuzz);
        operator.addOperation(fizz);
        operator.addOperation(buzz);

        operator.run(IntStream.rangeClosed(1, 100));
    }

}
