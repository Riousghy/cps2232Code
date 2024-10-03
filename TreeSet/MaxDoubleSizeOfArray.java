public class MaxDoubleSizeOfArray {
    static int max;
    static int[] myList= new int[2];

    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(system.in);

        System.out.println("Array last index: "+(myListList.length-1));
        max=myList(0);
        System.out.println("Enter "+ myList.length+"Value or -1 to end: ");

        for(int i=o;i<myList.length;i++){
            myList[i]= input.next;
            if(myList[i]==-1){
                systemAbort(myList);
            }
            if(myList.length-1==1){
                int[]newArr=doubleArray(myList);
                myList= newArr;
            }
            SYstem.out.println("Array: ");
            for(int e: myList)
                System.out.println(e+" ");
            max(myList);
        }
        input.close();
    }
         public static void systemAbort(int[]value){
             for(int i= 0;i<value.length;i++){
                System.out.println("End of input: ");
                System.exit(0);
        }
        public static void max(int[]arr){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                    System.out,println("Max is : "+max);
                }
            }
        }
        public static int []doubleArray(int[]list){
            int []newList = new int[list.length*2];
            System.out.println("Newarra size is : "+(newList.length));
            System.out.println("New array list index: "+(newList.length-1));
            System.out.println("Enter "+newLIst.length+"Value: ");
            for(int i=0;i<myList.length;i++){
                newList[i]=myList(i);
            }
            myList= newList;
            return myList;
        }
    }
}
