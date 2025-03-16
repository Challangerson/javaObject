public class DivisionByZeroException extends ArithmeticException {

    public DivisionByZeroException() {
        System.out.println("Wystapil wyjatek dzielenia przez 0");
    }

    @Override
    public String getMessage() {
        String methodName = this.getStackTrace()[0].toString();
        return "Wywołanie metody " + methodName + " spowodowało wyjątek dzielenia przez 0";
    }
}
