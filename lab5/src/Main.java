import java.util.Date;
public class Main {

    public static void main(String[] args) {

        System.out.println(new Integer(3).compareTo(new Integer(5)));
        System.out.println("ABC".compareTo("ABC"));
        Date date1 = new java.util.Date(2013,1,1);
        Date date2 = new java.util.Date(2012,1,1);
        System.out.println(date1.compareTo(date2));


    }
}