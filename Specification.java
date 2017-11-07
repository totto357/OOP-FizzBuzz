import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Specification {

    private List<Predicate<Integer>> predicateList = new ArrayList<>();

    public Specification(Predicate<Integer> predicate) {
        this.predicateList.add(predicate);
    }

    private Specification(List<Predicate<Integer>> predicateList) {
        this.predicateList = predicateList;
    }

    public Specification and(Predicate<Integer> predicate) {
        List<Predicate<Integer>> results = new ArrayList<>(this.predicateList);
        results.add(predicate);
        return new Specification(results);
    }

    public boolean isSatisfiedBy(Integer number) {
        return this.predicateList.stream().allMatch(p -> p.test(number));
    }

}
