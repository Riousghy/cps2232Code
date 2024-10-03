import java.util.Collection;

public interface MyList<E> extends Collection<E> {
    void add(int index, E e);
    E get(int index);
    int indexOf(Object e);
    int lastIndexOf(E e);
    E remove(int index);
    E set(int index, E e);

    default boolean add(E e) {
        add(size(), e);
        return true;
    }

    default boolean isEmpty() {
        return size() == 0;
    }

    default boolean remove(Object e) {
        if (indexOf(e) >= 0) {
            remove(indexOf(e));
            return true;
        } else {
            return false;
        }
    }

    default boolean containsAll(Collection<?> c) {
        // Left as an exercise
        return true;
    }

    default boolean addAll(Collection<? extends E> c) {
        // Left as an exercise
        return true;
    }

    default boolean removeAll(Collection<?> c) {
        // Left as an exercise
        return true;
    }

    default boolean retainAll(Collection<?> c) {
        // Left as an exercise
        return true;
    }

    default Object[] toArray() {
        // Return an array of the elements in the collection
        Object[] array = new Object[size()];
        int i = 0;
        for (E element : this) {
            array[i++] = element;
        }
        return array;
    }

    default <T> T[] toArray(T[] array) {
        // Return an array of the elements in the collection
        if (array.length < size()) {
            array=(T[]) java.lang.reflect.Array.newInstance(array.getClass().getComponentType(),size());

        }

        int i = 0;
        for (E element : this) {
            array[i++] = (T) element;
        }

        if (i < array.length) {
            array[i] = null;
        }

        return array;
    }
}