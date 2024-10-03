public class SampleHashFunction {
    public static void main(String[] args) {
        int H = 20;
        int[] arr = {20, 31, 79, 44, 153};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(hash(arr[i], H));
        }
    }

    public static int hash(int key, int H) {
        return key % H;
    }
}
