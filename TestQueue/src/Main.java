public class Main {
    public static void main(String[] args) {

        java.util.Queue<String> queue = new java.util.LinkedList<>();

        queue.offer("Oklahoma");
        queue.offer("Indiana");
        queue.offer("Georgia");
        queue.offer("Texas");

        while(queue.size()>0){
            System.out.println(queue.remove()+" ");
        }

    }
}