public class Main {
    public static boolean isPalindrome( String s ){
        if(s.length()<=1) {
            System.out.println(s.length());
            return true;
        }
        else if (s.charAt(0)!=s.charAt(s.length()-1))
            return false;
        else
            return isPalindrome(s.substring(1,s.length()-1));
    }
    public static void main(String[] args) {
//        System.out.println(isPalindrome("a"));
        System.out.println(isPalindrome("moo m "));

    }
}