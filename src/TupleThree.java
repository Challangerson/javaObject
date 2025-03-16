import java.lang.constant.Constable;

public class TupleThree<T> extends TupleTwo<T> {

    private T third;

    public TupleThree(T first, T second, T third) {
        super(first, second);
        this.third = third;
    }

    public T getThird() {
        return this.third;
    }

    public void setThird(T third) {
        this.third = third;
    }
}
