import java.lang.constant.Constable;

public class TupleFour<T> extends TupleThree<T> {

    private T fourth;

    public TupleFour(T first, T second, T third, T fourth) {
        super(first, second, third);
        this.fourth = fourth;
    }

    public T getFourth() {
        return this.fourth;
    }

    public void setFourth(T fourth) {
        this.fourth = fourth;
    }

    @Override
    public String toString() {
        return "TupleFour{" +
                "fourth=" + fourth + " "
                + super.getFirst().toString() +
                " " + super.getSecond().toString() +
                " " + super.getThird().toString() +

                '}';
    }
}
