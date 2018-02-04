public interface IStack {
    void push(StackElement value);
    StackElement pop();
    int size();
    boolean isEmpty();
    void print();
}