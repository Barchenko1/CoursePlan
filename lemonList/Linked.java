package lemonList;

public interface Linked<E> {
    void addLast(E e);
    void addFirst(E e);
    int size();
    void remove(E e);
    void set (E e);
    E getElementByIndex(int counter);
}
