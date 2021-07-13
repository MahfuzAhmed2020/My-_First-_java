package test.java.osa;

public class DoWhile {

public static void main(String[] args) {
	DoWhile.dh(5, 20);
	
}	
	public static void dh(int sn,int en) {
		
		int i=sn;
		while(i<=en) {
			System.out.println(i);
			i++;
		}
		int j=sn;
		do {System.out.println(j);
		j++;
		}
		while(j<=en);
		
	}
	
	
}
