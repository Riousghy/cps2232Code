public interface Queue <E>{
    /**Returns the number of elements in the queue*/
    int size();

     /**Test whether the queue is empty */
    boolean isEmpty();
    /**insert an element at the rear near the queue */
    void enqueue(E e);

    /** returns, but does not remove, the firs element of the queue( null if empty)*/
    E first() throws MyQueueException;

    E dequeue() throws MyQueueException;

}
