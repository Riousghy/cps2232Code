public class Main {
    public static void main(String[] args) {
        String name ="java";
        System.out.println("String before method call is "+ name);
        showImmutable(name);
        System.out.println("String after method call is "+ name);

    }
//    Another String reference is created for HTML
    public static void showImmutable(String name){
//      Java is now unreferenced
        name="HTML";// The value java is not change but only unreferenced.
        System.out.println("String inside method is "+ name);
    }
}