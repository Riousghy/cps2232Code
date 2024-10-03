public class TestQueue {
    public static<E> void main(String[] args) throws MyQueueException{
        ArrayQueue<String> eArrayQueue=new ArrayQueue();

//        System.out.println(eArrayQueue.isEmpty());
//        try{
//            eArrayQueue.first();
//        }catch(MyQueueException e){
//            System.out.print(e);
//        }

        eArrayQueue.enqueue("Ken");
        eArrayQueue.enqueue("Kean");
        eArrayQueue.enqueue("bob");
        eArrayQueue.enqueue("ann");


        eArrayQueue.size();
        eArrayQueue.first();

//        eArrayQueue.enqueue("Dan");
//        eArrayQueue.enqueue("Ke");
    }

}
