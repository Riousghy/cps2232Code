import java.util.EmptyStackException;
public class ArrayStack<E> implements Stack<E> {
    public static final int CAPACITY= 5;
    private E[]date;
    private int t = -1;
    public ArrayStack(){
        this(CAPACITY);
    }
    public ArrayStack(int capacity){
        date=(E[])new Object[capacity];
    }

    public int size(){
        return(t+1);
    }
    public boolean isEmpty(){
        return(t==1);
    }

    public void push(E e)throws IllegalStateException {
            if (size() == date.length)
                throw new IllegalStateException("Stack is full");
            date[++t] = e;
        }
        public E top () {
            if (isEmpty())
                return null;
            return date[t];
        }
        public E pop () {
            if (isEmpty())
                return null;
            E answer = date[t];
            date[t]=null;
            t--;
            return answer;
        }
}
