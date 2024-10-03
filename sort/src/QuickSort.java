public class QuickSort {
    static long startTime;
    static long endTime;
    static int  stepsTaken=0;
    public static void quickSort(int[] list) {
        startTime=System.nanoTime();
        quickSort(list, 0, list.length - 1);
        endTime=System.nanoTime();

    }

    public static void quickSort(int[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    public static int partition(int[] list, int first, int last) {
        int pivot = list[first];
        int low = first + 1;
        int high = last;
        while (high > low) {
            while (low <= high && list[low] <= pivot)
                low++;

            while (low <= high && list[high] > pivot)
                high--;

            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }
        while (high > first && list[high] >= pivot)
            high--;
        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        } else {
            return first;
        }
    }
    public static void main(String[]args){
        int[] list={2,3,2,5,6,1,-2,3,14,12,21,54,26,15,34,22,44,55,77,88};
        quickSort(list);
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
        System.out.println("Execution Time :"+(endTime-startTime));

    }
}
