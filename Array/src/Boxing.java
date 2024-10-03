
public class Boxing {
    public static void main(String[] args) {
        int x= 5;
        Integer intBoxing=(Integer)x;
        System.out.println("After boxing "+intBoxing);

        Integer intWrapperObject= new Integer(x);
        System.out.println("Integer wrapper object "+intWrapperObject);

        Integer intWrapperStringedObject= new Integer("56");
        System.out.println("Integer wrapper object: "+intWrapperStringedObject);
    }

    }
