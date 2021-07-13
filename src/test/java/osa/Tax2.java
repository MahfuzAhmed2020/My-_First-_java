package test.java.osa;

public class Tax2 {
	
	public static void main(String[] args) {
		Tax2 k=new Tax2();
		k.grossIncome(15000);
		k.expenses(300, 2500, 1255, 1336);
		double z=k.grossIncome(15000)-k.expenses(300, 2500, 1255, 1336);
		
		double t=z*.10;
		
		System.out.println(t);
		System.out.println(z);
		
		
		
		k.tax();
		
		
	}

	
	 static double grossIncome(double gIncome){
		  
		  System.out.println("gross  = "+gIncome);
			return gIncome;
	
 }	
	static double expenses(double gas,double maintenance,double toll,double insurance) {
		 
		 double totalE =gas+maintenance+toll+insurance;
		 System.out.println("totalExpenses  = "+totalE);
			return totalE ;
			
		}
	
	 static double taxableIncome() {
			double	taxableIncome=Tax2.grossIncome(1200000)-Tax2.expenses(5000, 3000, 2500, 3600);
			System.out.println("taxableIncome  = "+taxableIncome);
			return taxableIncome;
		}
void tax() {
	
	double totaltax=Tax2.taxableIncome()*0.25;
	
	System.out.println("tax  = "+totaltax);
	
}
	
	
	  
}
