import java.util.*;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        Set<String> set= new HashSet<>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        TreeSet<String> treeSet=new TreeSet<>(set);
        System.out.println("Sorted tree set: "+treeSet);
        System.out.println("first(): "+treeSet.first());
        System.out.println("last(): "+treeSet.last());
        System.out.println("hashSet(\"New York\"):"+ treeSet.headSet("New York"));
        System.out.println("tailSet(\"New York\"):"+ treeSet.tailSet("New York"));
        System.out.println("lower (\"P\"): " + treeSet. lower ("p"));
        System.out.println("higher (\"P\"): " + treeSet.higher ("p"));
        System.out.println("floor (\"P\"): " + treeSet.floor ("p"));
        System.out.println("ceiling (\"P\"): " + treeSet.ceiling ("p"));
        System.out.println("pollFirst()): " + treeSet.pollFirst ( ));
        System.out.println("pollLast () : " + treeSet. pollLast ());
        System.out.println("New tree set: " + treeSet);



    }

}
