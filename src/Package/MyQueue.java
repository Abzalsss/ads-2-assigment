package Package;

import java.util.NoSuchElementException;

public class MyQueue<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;
    MyLinkedList<Object> arr = new MyLinkedList<>();

    private static class Node<T> {
        T item;
        Node<T> next;

        Node(T item) {
            this.item = item;
            this.next = null;
        }
    }

    public MyQueue() {
        first = null;
        last = null;
        size = 0;
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
        size++;
    }

    public T removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("empty");
        }
        T item = first.item;
        first = first.next;
        if (first == null) {
            last = null;
        }
        size--;
        return item;
    }

    public T getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("empty");
        }
        return first.item;
    }

    public void addLast(T item) {
        arr.add(item);
    }

    public T removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("empty");
        }
        T item = last.item;
        Node<T> current = first;
        while (current.next != last) {
            current = current.next;
        }
        last = current;
        last.next = null;
        size--;
        return item;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
