import java.util.*;

public class Main {
    public static void main(String[] args) {
//    Box<String>StringBox= new Box<String>();
//    StringBox.put("Dadan");
//    String str=StringBox.get();
//    System.out.println(str);
//
//    Box<Integer> integerBox= new Box<>();
//    integerBox.put(52);
////    int num= integerBox.get();
////    System.out.println(num);
//     integerBox.getBox(integerBox);
//
////     List<Integer>[]arrayOfLists= new List <Integer>[2];
//
//     List<?>[]arrayOfList= new List<?>[2];
//


     Comparable<String> c= new String("red   dddd");
     System.out.println(c.compareTo("red"));

//      Set<String>names=new HashSet<>();
//        Set<String>names2=new LinkedHashSet<>();
//        Set<String>names3= new TreeSet<>();
//
//        List<String> names4= new ArrayList<>();
//        List<Set> names5=new ArrayList<>();
//        ArrayList<List>asdf= new ArrayList<>();

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // 创建一个ListIterator
        ListIterator<String> iterator = names.listIterator();

        // 向前遍历并打印元素
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+"  ");
        }

        // 向后遍历并将名字修改为大写
        while (iterator.hasPrevious()) {
            int index = iterator.previousIndex();
            String name = iterator.previous();
            String upperCaseName = name.toUpperCase();
            iterator.set(upperCaseName);
        }

        // 打印修改后的列表
        System.out.println();
        System.out.println("Modified List:");
        for (String name : names) {
            System.out.println(name);
        }

    }
}