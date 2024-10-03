public class supplemental {

    public static void main(String[] args) {
        int result1=supplementalHash(101);
        int result2=supplementalHash(205);
        int result3=supplementalHash("Hello World".hashCode());
        System.out.println("The result1 is "+result1);
        System.out.println("The result2 is "+result2);
        System.out.println("The result3 is "+result3);
        

    }
    private static int supplementalHash(int h) {
        h^=(h>>>20)^(h>>>12);
        return h^(h>>>7)^(h>>>4);
    }
}