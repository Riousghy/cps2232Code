public class GenericType <T>{
    private T t;
    public T get(){
        return this.t;
    }
    public void set (T t1){
        this.t=t1;
    }
    public static void main(String[]args){
        GenericType<String> type = new GenericType<>();
        type.set("Kean");
        System.out.println(type.get());

        GenericType type1 = new GenericType();
        type1.set("Ken");
        System.out.println(type1.get());
        type1.set(10);
        System.out.println(type1.get());
    }
}
