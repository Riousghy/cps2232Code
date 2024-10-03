public class HeapSort {
    public static <E extends Comparable<E>>void heapSort(E[]list) {
        Heap<E> heap = new Heap<>();
        for (int i = 0; i < list.length; i++) {
            heap.add(list[i]);
        }
        for (int i = list.length - 1; i >= 0; i--) {
            list[i] = heap.remove();
        }
    }
    //This is Rious YnagGuohao_1235857
        public static void main(String []args){
            Integer[] list={-44,-5,-3,3,3,1,-1,0,1,2,4,5,53};
            heapSort(list);
            for(int i= 0;i<list.length;i++ ){
                System.out.print(list[i]+" ");
            }
            System.out.println(" ");
            Character[]array={'R','B','Z','A','W','g','Q','h'};
            heapSort(array);
            for(int i= 0;i<array.length;i++ ){
                System.out.print(array[i]+" ");
            }



        }

}
