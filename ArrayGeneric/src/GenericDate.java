import java.util.ArrayList;
import java.util.Date;
public class GenericDate {
    public static void main(String[] args){
        ArrayList<Date> dates= new ArrayList<>();

        dates.add(new Date());
        System.out.println("Generic type Date"+ dates);

        Date date = dates.get(0);
        System.out.println("Date object is:" + date);

//        ArrayList<Integer>intList=new ArrayList<>();
    }
}
