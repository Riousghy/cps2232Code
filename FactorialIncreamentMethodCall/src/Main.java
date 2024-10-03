
public class Main {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }

    public static double factorial(int n) {
        int fact = 1;
        if (n == 0 || n == 1)
            return 1;
        else
            for (int i = 2; i <= n; i++) {
                fact = fact * i;
            }
        return fact;
    }
}
//    public static double factorial(long x){
//        long fact =1;
//        if(n == 0 || n==1)
//            return 1;
//        else
//            for(int i =2;i<=n;i++){
//                fact=fact*i;
//            }
//            return fact;
//        if(x==0)
//            return 1;
//        else
//            return x*factorial(x-1);

//    }
//}