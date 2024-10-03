public class CharDefaultTest {
    char c;
    public static void main(String[] args) throws Exception{
        CharDefaultTest t;
        t = new CharDefaultTest();
        char c1='\u0000';
        System.out.println(t.c);
        System.out.println(c1);
        System.out.println(t.c==c1);
        System.out.println(0==c1);
        System.out.println(t.toString());

    }
}