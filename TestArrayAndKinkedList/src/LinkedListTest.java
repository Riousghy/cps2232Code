public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();

        lList.addNode("Ken");
        lList.addNode("Kean");
        lList.addNode("Bob");
        lList.addNode("Lisa");
        lList.addNode("Guoaho Yang");
        lList.addFirst("Wku");
        lList.display();

        LinkedList<Integer> lList2 = new LinkedList<>();
        lList2.addNode(5);
        lList2.addNode(-8);
        lList2.addNode(2);
        lList2.addNode(1);
        lList2.addNode(6);
        lList2.addFirst(80);
        lList2.addLast(122);
        lList2.display();
    }
}
