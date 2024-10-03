public class selectionSort {
    static long startTime;
    static long endTime;
    static int stepsTaken=0;
    public static void selectSort(double[]list){
        startTime=System.nanoTime();
        for(int i=0;i<list.length;i++){
            double currentMin= list[i];
            int currentMinIndex=i;
            System.out.println("Curr min: "+ currentMin);

            for(int j=i+1;j<list.length;j++){
                if(currentMin>list[j]){
                    currentMin=list[j];
                    currentMinIndex=j;
                    System.out.println("New curr min: "+ currentMin);
                }
            }
            if(currentMinIndex!=i){
                list[currentMinIndex]=list[i];
                list[i]=currentMin;
            }
        }
        endTime=System.nanoTime();
    }
    public static void main(String[]args) {
        double[]arr= {5,5,3,7,1,8,2,4,4,2};
        selectSort(arr);
        System.out.println("Excution Time: "+(endTime-startTime));
    }

}
