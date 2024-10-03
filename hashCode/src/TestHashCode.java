import java.util.HashSet;
import java.util.Set;

public class TestHashCode {
    public static void main(String[] args) {

        Set<String> set= new HashSet<>();

        set.add("London");
        set.add("Paris");
        set.add("new York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("new York");

        System.out.println(set);

        for(String s:set){
            System.out.println(s.toUpperCase()+" ");
        }

        System.out.println();
        set.forEach(e->System.out.println(e.toLowerCase()));
    }

}
