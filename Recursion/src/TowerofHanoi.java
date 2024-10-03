
public class TowerofHanoi {
	
	
	public static void towerOfHanoi(int n,char from,char to, char aux) {
		if(n==1) {
			System.out.println("Remove plate "+n+" from "+from+" to "+to);
		}else {
			
			towerOfHanoi(n-1,from,aux,to);
			System.out.println("Remove plate "+n+" from "+from+" to "+to );
			towerOfHanoi(n-1,aux,to,from);
		}
	}
	public static void main(String[] args) {
		
		towerOfHanoi(3,'a','b','c');
	}

}
