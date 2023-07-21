package HW_4.linkedlist.list;

import HW_4.linkedlist.Deque;
import HW_4.linkedlist.List;

import java.util.Iterator;

public class LinkedList<T> implements Deque<T>, List<T> {
    private int size;
    {
        size = 0;
    }

    private Node<T> head;
    private Node<T> tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public LinkedList(T head) {
        this();
        addFirst(head);
    }

    @Override
    public  boolean isEmpty() { return head == null; }

    // add in start
    @Override
    public void addFirst(T t) {
        Node<T> temp = new Node<>(t);
        if (isEmpty()) tail = temp;
        else head.prev = temp;

        temp.next = head;
        head = temp;
        size++;
    }
    // add to end
    @Override
    public void addLast(T t) {
        Node<T> temp = new Node<>(t);

        if (isEmpty()) head = temp;
        else tail.next = temp;

        temp.prev = tail;
        tail = temp;
        size++;
    }

    // add
    @Override
    public LinkedList<T> add(T t) {
        addLast(t);
        return this;
    }

    // add by index
    @Override
    public LinkedList<T> add(int i, T t) {
        if (i < 0 || i >= size) return this;

        Node<T> current = getNode(i);
        Node<T> temp = new Node<>(t, current.prev, current);
        current.prev.next = temp;
        current.prev = temp;
        return this;
    }
    // delete
    @Override
    public void removeFirst() {
        remove(0);
    }
    // delete last
    @Override
    public void removeLast() {
        remove(size - 1);
    }
    // get by index
    @Override
    public T get(int i) {
        if (i < 0 || i >= size) return null;

        return getNode(i).data;
    }
    // delete by index
    @Override
    public void remove(int i) {
        Node<T> nodeToRemove = getNode(i);
        if (nodeToRemove == null) return;

        if (nodeToRemove != head) nodeToRemove.prev.next = nodeToRemove.next;
        else head = nodeToRemove.next;

        if (nodeToRemove != tail) nodeToRemove.next.prev = nodeToRemove.prev;
        else tail = nodeToRemove.prev;

        nodeToRemove.prev = nodeToRemove.next = null;
        size--;
    }
    // size
    @Override
    public int size() { return size; }

    @Override
    public Iterator<T> iterator() {
        return (Iterator<T>) new LinkedListIterator<>(head);
    }
    // change by index
    @Override
    public void update(int i, T t) {
        Node<T> currentNode = getNode(i);
        currentNode.data = t;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
                .append(this.getClass().getSimpleName());

        if (size < 1) return sb.toString();

        sb
                .append(" Size: ")
                .append(size)
                .append( " (");

        for (T el: this) {
            sb.append(el);
            sb.append(el == tail.data ? ")" : ", ");
        }

        return sb.toString();
    }

    public Node<T> getNode(int i) {
        Node<T> current = head;

        for (int pos = 0; current != null && pos < i; pos++) {
            current = current.next;
        }

        return current;
    }
}
