public class DoubleArraySize {
    public  static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        int[] myList = new int[2];
        System.out.println("Last index: "+(myList.length-1));
        System.out.println("Enter "+ myList.length+ " Values: ");
        System.out.println("Array is: ");
        for(int i =0;i<myList.length;i++){
            myList[i]=input.nextInt();
            if(myList[i]==-1){
                System.out.println("End if input!");
                System.exit(0);
            }
            for(int l:myList)
                System.out.print(l+" ");
            if(myList.length-1==i){
                int[]newList= new int[myList.length*2];
                System.out.println();
                System.out.println("new Array last index: "+(newList.length-1));
                System.out.println("Enter "+ newList.length+"Values: ");
                for(int j=0;j<myList.length;j++){
                    newList[j]=myList[j];
                }
                myList= newList;
            }
        }
        input.close();
    }
}
