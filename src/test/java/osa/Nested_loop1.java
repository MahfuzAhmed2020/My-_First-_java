package test.java.osa;

public class Nested_loop1 {
public static void main(String[] args) {
	//Nested_loop1.nesIn();
	Nested_loop1.nest();
}
	
	
	public static void nest() {
		
		for(int i=1;i<=4;i++) {
			
			System.out.println(i+"        I");
		         	
			for(int j=1;j<2;j++) {
				System.out.println(j+"    P");
			
			for(int k=1;k<2;k++) {
				System.out.println(k+"  L");
			}
		}
			
		}
		
	}
	
	
	
	
	public static void nesIn() {
		
		//    1      2     4
		for(int i =1;i<=5;i++) {
		//                    3	
			System.out.println(i);
			
		}
		
		
		
	}
	
	
	
}
