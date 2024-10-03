

public class BubbleSort {
    static long startTime;
    static long endTime;
    static int  stepsTaken=0;
    public static void main(String[] args) {
        int arr[]= {3,2,5,3,6,5,1,2,3,4,5,6,78,3,1,1,4,5,7,8};
        bubbleSort(arr);
        System.out.println("Sorted (Bubble) list");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println("Execution Time :"+(endTime-startTime));

    }


    static void bubbleSort(int[]arr){
        startTime=System.nanoTime();
        int n=arr.length;
        int temp=0;
        int selectTaken=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<(n-1);j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    stepsTaken=stepsTaken+1;
                    System.out.println("Steps: "+stepsTaken);
                }
            }
        }
        endTime=System.nanoTime();
    }

}