public class gcd4{


static long startTime;
static long endTime;
static int stepsTaken=0;

public static int gcd (int m, int n){
        startTime=System.nanoTime();
        if (m % n== 0) {
        System.out.println("Linear Time step1:" +(++stepsTaken));
        return n;
        }else {
            System.out.println("Linear Time step2: " + (++stepsTaken));
            return gcd(n, m % n);
        }
}
        public static void main (String[] args) {
            int x = 125;
            int y = 25;
            System.out.println("GCD 1s: " + gcd(x, y));
            endTime = System.nanoTime();
            System.out.println("Execution Time : " + (endTime - startTime));
        }
}