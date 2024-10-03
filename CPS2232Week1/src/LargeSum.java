
public class LargeSum {

	
	public static void main(String[] args) {
 		int a=2; 
		double x=0.5;
		System.out.println(sum(a,x));
	}
	public static double sum(int a, double x) {
		double sum=0.0;
		for(int i=1;i<50;i++) {
			sum += a*Math.pow(x, i);
		}
		return sum;
	}
}
