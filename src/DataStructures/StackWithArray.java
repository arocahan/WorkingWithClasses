package DataStructures;

import java.util.NoSuchElementException;

public class StackWithArray {

    private int top;
    private final Object [] data;


    public StackWithArray(int n) {
        top = 0;
        data = new Object[n];
    }

    public void push(Object obj) {
        data[top++] = obj;
    }

    public Object pop() {
        if (isEmpty()) throw new NoSuchElementException();
        return data[--top];
    }

    public Object peek() {
        if (isEmpty()) throw new NoSuchElementException();
        return data[top - 1];
    }

    public boolean isFull() {
        return top == data.length;
    }

    public boolean isEmpty() {
        return top == 0;
    }
}