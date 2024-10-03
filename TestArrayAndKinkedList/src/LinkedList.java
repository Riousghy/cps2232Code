public class LinkedList <E>{
    class Node{
        E date;
        Node next;

        public Node(E date){
            this.date=date;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail = null;

    public void addNode(E date) {
        Node newNode = new Node(date);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

        public void display (){
            Node current = head;
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            System.out.println("Nodes of singly linked list: ");
            while(current!=null){
                System.out.println(current.date+"---->");
                current = current.next;
            }
            System.out.println();
        }

        public void addFirst(E date) {
            Node newNode = new Node(date);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;

            }
        }

        public void addLast(E date){
                Node newNode = new Node(date);
                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }


    }


