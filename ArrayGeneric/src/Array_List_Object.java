public class Array_List_Object <E>{
    public static<E> void arrayMethod(E[]array){
        for(int i =0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static <E> void main(String[] args){
        Object[] array= {1,2,3,4,5,"@Kean.edu","ken","No 203 Johnson Street, New York", 98.4};
        Array_List_Object.arrayMethod(array);
    }
}
