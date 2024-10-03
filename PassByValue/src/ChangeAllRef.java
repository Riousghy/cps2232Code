public class ChangeAllRef {
    public static void main(String[]args){
        int[]score ={3,6,9,12,15};

        System.out.println("Value before method call:");

        for(int i=0;i<score.length;i++) {
            System.out.print(score[i]+" ");
        }
        changeAllRef(score);

        System.out.println(" " );

        System.out.println("Value after method call:" );
        for(int i=0;i<score.length;i++) {
            System.out.print( score[i]+" ");
        }
    }
    public static void changeAllRef(int[] x){
            for(int i=0;i<x.length;i++){
                x[i]*=3;
        }

    }
}
