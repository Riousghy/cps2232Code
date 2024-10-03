public class Main {
    static int count;
    public static void main(String[] args) {
        int n =11;
        System.out.println("Fib("+n+") ="+fib(n));
        System.out.println("count: "+count);

    }
    public static int fib(int num){
        count++;
        if(num==0)
            return 0;
        if(num==1)
            return 1;
        else{
            return fib(num-1)+fib(num-2);
        }
    }
}