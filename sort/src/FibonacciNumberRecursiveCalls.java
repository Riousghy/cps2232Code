public class FibonacciNumberRecursiveCalls {
    static int stepsTaken=0;
    static long startTime;
    static long endTime;
    public static void main(String[]args){
        int n= 11;
        System.out.println("Fib("+n+") ="+ fib(n));
        System.out.println("StepTaken "+ stepsTaken);
        System.out.println("Ecu Time is "+ (endTime-startTime));
    }
    public static int fib(int num){
        ++stepsTaken;
        startTime=System.nanoTime();
        if(num==0)
            return 0;
        if(num==1||num==2)
            return 1;
        else{
                return fib(num - 1) + fib(num - 2);
        }
    }
    public static int fibonacci( int n){
        if(n<=1)
            return 1;
        int last=1;
        int nextToLast=1;
        int answer=1;

        for(int i=2;i<=n;i++){
            answer=last+nextToLast;
            nextToLast=last;
            last=answer;
        }
        return answer;
    }

}
