public class Main {
    public static void main(String[] args) {
    Parent p= new Parent();
    p.parentFirstMsg();

//    Parent pc= new ParentChild();
//    pc.parentFirstMsg();

//    Parent pc = new ParentChild();
//    pc.parentSecondMsg();
//
//    ParentChild pc= new ParentChild();
//    pc.parentFirstMsg();

    ParentChild pc= new ParentChild();
    pc.parentSecondMsg();

    }
}