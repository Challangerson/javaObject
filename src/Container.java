import java.lang.constant.Constable;

public class Container<T> {
    private T object;

    public Container(T object) {
        this.object = object;
    }

    public T getObject() {
        return this.object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public void print() {
        System.out.println(this.object.toString());
    }

    @Override
    public String toString() {
        return
                "object=" + object;
    }
}
