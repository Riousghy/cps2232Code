public class PassByRefArrays {
    public static void main(String[]args){
        int[]score ={1,2,3,4,5};

        System.out.println("Value before method call:"+score[3]);
        changeRef(score);
        System.out.println("Value after method call:"+score[3]);


    }
    public static void changeRef(int[] x){
        x[3]*=4;
        System.out.println("Value inside method is "+x[3]);
    }

}
