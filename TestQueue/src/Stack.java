import java.util.EmptyStackException;

public interface Stack<E>{
    public int size();

    public boolean isEmpty();

    public void push(E e);

    public E top()
        throws StackEmptyException;

    public E pop()
        throws EmptyStackException;
}
