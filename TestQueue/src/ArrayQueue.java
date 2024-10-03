public class ArrayQueue<E> implements Queue<E>{
    private E[]date;
    private int f=0;

    private int sz=0;

    public ArrayQueue(){
        this(ArrayStack.CAPACITY);
    }
    public ArrayQueue(int capacity){
        date=(E[])new Object[capacity];
    }

    public int size(){
        return sz;
    }
    public boolean isEmpty(){
        return(sz==0);
    }
    public void enqueue(E e)throws IllegalStateException{
        if(sz==date.length)throw new IllegalStateException("Queue is full");
        int avail = (f+sz)%date.length;
        date[avail]=e;
        sz++;
    }
    public E first() throws MyQueueException{
        if(isEmpty()) throw new MyQueueException("The Queue is empty, YOU CAN NOT FIRST");
        return date[f];
    }
    public E dequeue() throws MyQueueException{
        if(isEmpty()) throw new MyQueueException("The queue is empty, you can not dequeue");

        E answer=date[f];
        f=(f+1)%date.length;
        sz--;
        return answer;
    }
}
