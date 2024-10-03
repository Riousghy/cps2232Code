import java.util.Set;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {
    public static void main(String[] args){
        Set <String> set = new LinkedHashSet<>();

        set.add("London");
        set.add("Paris");
        set.add("new York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("new York");

        System.out.println(set);

        for(String element:set){
            System.out.print(element.toLowerCase()+ " ");
        }
    }
}
