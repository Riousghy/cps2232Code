public class LogarithmicTimeComplexity {
    static int step=0;
    public static void main(String[]args){
        int[]array={1,2,3,4,5,6,7,8,9,10,11};
        int num=11;
        System.out.println("Search index: "+ binarySearch(array,num));
    }
    public static int binarySearch(int[]arr,int search){
        int low=0;
        int high = arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(search==arr[mid])
                return mid;
            else if(search<arr[mid])
                high=mid-1;
            else
                low=mid+1;
        }
        step++;
        System.out.println("Seaech not found");
        return -low-1;
//        System.out.println(step);
    }
}
