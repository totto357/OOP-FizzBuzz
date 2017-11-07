public class Operation {

    private Specification specification;
    private String message;

    Operation(Specification specification, String message) {
        this.specification = specification;
        this.message = message;
    }

    public Specification getSpecification() {
        return this.specification;
    }

    public String getMessage() {
        return message;
    }

}
