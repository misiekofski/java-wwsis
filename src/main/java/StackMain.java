import java.util.Arrays;

public class StackMain implements IStack {
    private int maxSize;
    private StackElement[] arrayStack;
    private int top;

    public StackMain(int size){
        maxSize = size;
        arrayStack = new StackElement[maxSize];
        top = -1;
    }
    public void push(StackElement value){
        if (top==maxSize-1) {
            System.out.println("Stack is full. Please see: stackoverflow.com ;)");
        } else {
            arrayStack[++top] = value;
        }
    }

    public StackElement pop(){
        if (!isEmpty()) {
            return arrayStack[top--];
        } else {
            System.out.println("Stack is empty. Please see: Algorithms and Data Structures.");
            return null;
        }
    }

    public int size(){
        return arrayStack.length;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public void print(){
        System.out.println(Arrays.toString(arrayStack));
    }

    public static void main(String[] args) {
        StackMain stack = new StackMain(10);

        StackElement<Integer> intElement = new StackElement(3);
        StackElement<String> strElement = new StackElement<>("Some string");

        stack.push(intElement);
        stack.push(strElement);


        StackElement popTest = stack.pop();
        System.out.println("Pop test #1: " + popTest.toString());
        popTest = stack.pop();
        System.out.println("Pop test #2: " + popTest.toString());


        stack.print();
        System.out.println("Stack size: " + stack.size());
        System.out.println("Is stack empty: " + stack.isEmpty());


    }
}