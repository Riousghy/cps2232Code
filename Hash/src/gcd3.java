public class gcd3 {
    static long startTime;
    static long endTime;
    public static int gcd(int m,int n) {
        startTime = System.nanoTime();
        int stepsTaken = 0;
        int gcdResult = 1;
        if (m == n)
            return m;
        for (int k = m / 2; k >= 1; k--) {
            System.out.println("Linear Time step: " + (++stepsTaken));
            if (m % k == 0 && n % k == 0) {
                gcdResult = k;
                break;
            }
        }
        endTime=System.nanoTime();
        return gcdResult;
    }
    public static  void main(String[]args){
        int x=125;
        int y=25;
        System.out.println("GCD is: "+ gcd(x,y));
        System.out.println("Excution Time: "+(endTime-startTime));
    }
}

