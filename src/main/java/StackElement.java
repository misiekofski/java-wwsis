public class StackElement<T> {
    private T value;
    private StackElement next;

    public StackElement(T value) {
        this.value = value;
    }
    public StackElement getNext() {
        return next;
    }
    public void setNext(StackElement next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}