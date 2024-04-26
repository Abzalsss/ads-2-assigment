package Package;

public class MyQueue<T> {

    private Node<T> first;
    private Node<T> last;

    public boolean empty() {
        return first == null;
    }

    public int size() {
        int count = 0;
        Node<T> current = first;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public T peek() {
        return first.value;
    }

    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        if (last == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    public T dequeue() {
        T value = first.value;
        first = first.next;
        if (first == null) {
            last = null;
        }
        return value;
    }

    private static class Node<E> {
        private E value;
        private Node<E> next;

        public Node(E value) {
            this.value = value;
        }
    }
}
