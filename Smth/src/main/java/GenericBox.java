public class GenericBox<T, V> {
    private T obj1;
    private V obj2;

    public GenericBox(T obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1() {
        return obj1;
    }

    public V getObj2() {
        return obj2;
    }

    public void setObj(T obj) {
        this.obj1 = obj;
    }
}
