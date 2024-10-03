public class Fibonacci {
        public static void main(String[] args) {
            int n1 = 11;
            System.out.println("Fibonacci series for n = " + n1 + ":");
            getFibonacciSeries(n1);

            int n2 = 100;
            System.out.println("Fibonacci series for n = " + n2 + ":");
            getFibonacciSeries(n2);
        }
        public static void getFibonacciSeries(int n) {
            long[] fibSeries = new long[n + 1];
            fibSeries[0] = 0;
            fibSeries[1] = 1;

            for (int i = 2; i <= n; i++) {
                fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
            }
            for (int i = 0; i <= n; i++) {
                System.out.print(fibSeries[i] + " ");
            }
            System.out.println();
        }
    }


