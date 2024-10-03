import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;


public class Iteration_HashSet {
    public static void main(String[] args) {
     Set<String> mySet= new HashSet<>();
     mySet.add("London");
     mySet.add("Lagos");
     mySet.add("Kiev");
     mySet.add("New York");
     mySet.add("Beijing");

     Iterator<String> iter = mySet.iterator();
     while( iter.hasNext()){
         System.out.println(iter.next());
     }
    }
}
