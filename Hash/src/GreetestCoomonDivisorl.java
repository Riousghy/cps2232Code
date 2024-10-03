public class GreetestCoomonDivisorl {
    static long startTime;
    static long endTime;
    public static int gcd(int m,int n) {

        int stepsTaken = 0;
        startTime = System.nanoTime();
        int gcd = 1;
        for (int k = 2; k < m && k <= n; k++) {
            if (m % k == 0 && n % k == 0){
                gcd = k;
            endTime = System.nanoTime();
//            break;
        }
    }
            System.out.println("Execution Time :"+(endTime-startTime));
            return gcd;
    }
    public static  void main(String[]args){
        int x=270;
        int y=192;
        System.out.println("GCD is: "+ gcd(x,y));
    }
}
