
public class gcd {
    public static int gcd (int a, int b) {
        if(b==0) {
            System.out.println("The result: ");
            return a;
        }else {
            System.out.println("a is "+a);
            System.out.println("b is "+b);
            System.out.println("new b is "+a%b);
            return gcd(b,a%b);
        }
    }

    public static void main(String[]args) {

//        stem.out.println(gcd(48,18));
    }
}
