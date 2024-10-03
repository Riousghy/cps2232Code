import java.util.ArrayList;
import java.util.Arrays;

public class TryMethod {
    public static void main(String[] args) {
        String[]array={"red","green","blue"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println(arrayList.get(1));
        arrayList.add(1,"Canada");
        System.out.println(arrayList);
        arrayList.set(0, "Canada");
        System.out.println(arrayList);
        arrayList.add("black");
        System.out.println(arrayList);
    }
}
