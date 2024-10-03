import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

public class TestForEach {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");
        collection.forEach(e-> System.out.println(e.toUpperCase()+" "));

    }

    }
