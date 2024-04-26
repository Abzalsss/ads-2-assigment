package Package;

public class MyStack<T> {

    private Object[] item;
    private int top = 0;
    MyLinkedList<Object> arr = new MyLinkedList<>();

    public MyStack() {
        item = new Object[10];
    }

    public boolean empty() {
        return top == 0;
    }

    public int size() {
        return top;
    }

    public T peek() {
        return (T) item[top - 1];
    }

    public void push(T element) {
        if (top == item.length) {
            Object[] newitem = new Object[item.length * 2];
            System.arraycopy(item, 0, newitem, 0, item.length);
            item = newitem;
        }
        item[top++] = element;
    }

    public T pop() {
        T element = (T) item[--top];
        item[top] = null;
        return element;
    }
}

