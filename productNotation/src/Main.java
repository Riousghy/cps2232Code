// 按两次 Shift 打开“随处搜索”对话框并输入 `show whitespaces`，
// 然后按 Enter 键。现在，您可以在代码中看到空格字符。
public class Main {
    public static void main(String[] args) {
       double a =2.0;
       double x=0.5;
       System.out.println(product(a,x));
    }
    public static double product(double a,double x){
        double sum=0;
        for(int i=1;i<=20;i++){
            sum+=a*Math.pow( x, i);
        }
        return sum;
    }
}