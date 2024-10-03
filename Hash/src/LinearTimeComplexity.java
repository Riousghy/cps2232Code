public class LinearTimeComplexity {
    static int step=0;
    public static void main(String[] args) {
        long start=System.nanoTime();



        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int sumFirstTwentyNum = 0;
        for (int i = 0; i < array.length; i++) {
            sumFirstTwentyNum = sumFirstTwentyNum + array[i];
        }
        System.out.println(sumFirstTwentyNum);
        long end=System.nanoTime();
        System.out.println(end-start);
    }
    
}
