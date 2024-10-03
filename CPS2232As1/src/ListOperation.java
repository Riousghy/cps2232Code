import java.util.ArrayList;
import java.util.List;
    public class ListOperation {
            public static void main(String[] args) {
                    List<Integer> myList = new ArrayList<>();
                    myList.add(34);
                    myList.add(12);
                    myList.add(52);
                    myList.add(16);
                    myList.add(12);

                    // Find the index of 52
                    int index = find(myList, 52);
                    if (index != -1) {
                        System.out.println("Index of 52: " + index);
                    } else {
                        System.out.println("52 not found in the list.");
                    }

                    // Replace 16 with -1
                    replace(myList, 16, -1);
                    System.out.println(myList);
                }
                public static int find(List<Integer> list, int findValue) {
                    return list.indexOf(findValue); // Find and return the index of the value
                }
                public static void replace(List<Integer> list, int oldValue, int newValue) {
                    int index = list.indexOf(oldValue);
                    if (index != -1) {
                        list.set(index, newValue);
                    }
                }
            }
