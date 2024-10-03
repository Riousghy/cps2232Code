public class GenericMethods {
    public static void main(String[] args) throws Exception{
        Integer[]num={1,2,3,4,5};
        String[]str={"London","Paris","New York","Beijing","Amsterdam"};
        Double[]doub={1.0,2.0,3.0,4.0,5.0};
        GenericMethods.<Integer>display(num);
        GenericMethods.<String>display(str);
        GenericMethods.<Double>display(doub);
    }
    public static <E> void display(E[]list){
        for(int i =0;i< list.length;i++){
            System.out.println(list[i]+"  ");
            System.out.println();
        }
    }

    }
