import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * how to use
 * 
 * Operation fizzbuzz = Operation.when(divisibleBy3).and(divisibleBy5).print("FizzBuzz")
 */
@Getter
@AllArgsConstructor
public class OperationWithBuilder {

    private Specification specification;
    private String message;

    private Operation(Builder builder) {
    this.specification = builder.getSpecification();
    this.message = builder.getMessage();
    }
    
    public static Builder when(Predicate<Integer> predicate) {
        return new Builder(predicate);
    }
    
    @Getter
    static class Builder {
    
        private Specification specification;
        private String message;
        
        public Builder(Predicate<Integer> predicate) {
            this.specification = new Specification(predicate);
        }
        
        public Builder and(Predicate<Integer> predicate) {
            this.specification = this.specification.and(predicate);
            return this;
        }
        
        public Operation print(String message) {
            this.message = message;
            return new Operation(this);
        }
    
    }

}

