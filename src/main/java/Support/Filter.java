package Support;

public interface Filter<T> {

    public boolean isAccept(T record);
}
