public class MergeSort {
    static long startTime;
    static long endTime;
    static int  stepsTaken=0;
    public static void mergeSort(int[]list){
        startTime=System.nanoTime();
        if(list.length>1){
            int []firstHalf= new int [list.length/2];
            System.arraycopy(list,0,firstHalf,0,list.length/2);

            mergeSort(firstHalf);

            int secondHalfLength=list.length-list.length/2;
            int[] secondHalf= new  int [secondHalfLength];
            System.arraycopy(list,list.length/2,secondHalf,0,secondHalfLength);
            mergeSort(secondHalf);
            merge(firstHalf,secondHalf,list);
            endTime=System.nanoTime();
        }
    }
    public static void merge(int []left, int []right,int []merged){
        int lCurrIndex=0;
        int rCurrIndex=0;
        int mergedCurrIndex=0;

        while(lCurrIndex<left.length && rCurrIndex<right.length){
            if(left[lCurrIndex]<right[rCurrIndex]){
                merged[mergedCurrIndex++]=left[lCurrIndex++];
            }
            else{
                merged[mergedCurrIndex++]=right[rCurrIndex++];

            }
        }
        while(lCurrIndex<left.length)
            merged[mergedCurrIndex++]=left[lCurrIndex++];
        while(rCurrIndex<right.length)
            merged[mergedCurrIndex++]=right[rCurrIndex++];
    }
    public static void main(String[]args){
        int[ ] list={2,3,2,5,6,1,-1,3,14,12};
        mergeSort(list);
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
        System.out.println();
        System.out.println("Execution Time :"+(endTime-startTime));

    }
}
