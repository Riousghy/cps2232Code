public class InsertionSort {
    static long startTime;
    static long endTime;
    static int stepsTaken=0;
    public static void insertionSort(int[ ]list ){
        startTime=System.nanoTime();
        for(int i=0;i<list.length;i++){
            int currentElement=list[i];
            int stepsTaken=0;
            int j ;
            for(j=0;j>=0 && list[j]> currentElement; j--){
                list[j+i]=list[j];
                stepsTaken++;
                System.out.println(list[j]+" in index "+ j + " : "+ stepsTaken+ " swaps ");
            }
            list[j+i]=currentElement;
            endTime=System.nanoTime();
        }
    }
    public static void main(String[] args){
        int []list={2,3,2,6,5,1,-2,3,17,12,11,17,18,19,9,6,4,2,87,20};
        insertionSort(list);
        System.out.println("Second list: ");
        for(int i=0;i<list.length;i++)
            System.out.print(list[i]+" ");

        System.out.println(" ");
        System.out.println("Excution Time: "+(endTime-startTime));
        System.out.println(stepsTaken);
    }
}
