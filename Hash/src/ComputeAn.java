public class ComputeAn {
    static int step1=0;
    static int step2=0;
    public static void main(String[]args) {

        int a =2;
        int n=8;
        long start1 = System.nanoTime();
        int result1=1;
        for(int i=0;i<=n;i++)
            result1*=a;
        long end1=System.nanoTime();

        System.out.println("First is "+ (end1-start1));
        long start2 = System.nanoTime();
        int result2=1;

        for(int i=0;i<=n;i++)
            result2=result2*result2;
        long end2=System.nanoTime();

        System.out.println("Second is "+ (end2-start2));


    }
}
