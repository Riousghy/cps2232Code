public class HashCodeLongType {
    public static void main(String[]args){
        int x=3;
        int y=5;
        System.out.println("Bitwise x^y = "+(x^y));
        System.out.println("Bitwise x|y = "+(x|y));

        long key=1234567890000000000L;
        int hashcode=(int)(key^(key>>32));
        System.out.println("Hahshcode of key as int type = "+hashcode);
        int modoulo=hashcode%20;
        System.out.println(modoulo);


        long bits=Double.doubleToLongBits(key);
        double keyDouble=1234567890000000000L;
        int hashCodeDouble=(int)(bits^(bits>>32));



    }
}
