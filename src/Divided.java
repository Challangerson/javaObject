public class Divided {

    public static void main(String[] args) {

        divisionF(0.0F, 5.0F);
        divisionD(5.3, 0.0);
    }

    public static void divisionD(double a, double b) {
        try {
            double x = a/b;
            System.out.println(x);


        } catch (ArithmeticException e) {
            throw new DivisionByZeroException();
        }
    }

    public static void divisionF(float a, float b) {
        try {
            float x = a/b;
            System.out.println(x);


        } catch (ArithmeticException e) {
            throw new DivisionByZeroException();
        }
    }
}
