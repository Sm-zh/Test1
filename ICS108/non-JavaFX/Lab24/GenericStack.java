package Lab24;

public class GenericStack<E> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();

    public void add(E element) {
        list.add(element);
    }

    public E remove() {
        if (list.size() > 0) {
            E element = list.remove(0);
            return element;
        }
        else {
            return null;
        }
    }
}
