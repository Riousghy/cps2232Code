public class GenericMethod {
    public static <T> boolean isEqual (GenericType<T> a, GenericType<T>b){
        return a.get().equals(b.get());
    }
    public static void main(String[]args) {
    GenericType<String> a =new GenericType<>();
    a.set("Kean");

    GenericType<String> b =new GenericType<>();
    b.set("Ken");

    boolean isEqual = GenericMethod.isEqual(a,b);
    System.out.println(isEqual);

    System.out.println(isEqual= GenericMethod.isEqual(a,b));

    }
    }
