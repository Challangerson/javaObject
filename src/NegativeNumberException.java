public class NegativeNumberException extends RuntimeException {


    public NegativeNumberException() {
        super("Negative number not allowed");
    }

    @Override
    public String getMessage() {
        String methodName = this.getStackTrace()[0].toString();
        return "Wywołanie metody " + methodName + " ma ujemna liczbe";
    }
}
