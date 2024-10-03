public class CalculateSum {
    public static void main(String[] args) {
        int temp1=0;
        int temp2=0;
        double temp3=1;
        double s;
        for (int i = 1;i<=4;i++){
            temp1+=i;
        }
        for (int j = 1;j<=5;j++){
            temp2+=j;
            }
        for (int i = 1;i<=4;i++){
            temp3*=Math.pow(i,2);
        }
        s=2*temp1*temp2*temp3;
    System.out.println(s);
    }
}
