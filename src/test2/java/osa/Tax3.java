package test2.java.osa;

public class Tax3 extends Hourly_salary {

	public static void main(String[] args) {
		Tax3 j=new Tax3();
		int k=j.income(120000);        //    200=j.income(120000)                     int k=200;                  
		int g=j.eepenses(25000, 40000);//    100=j.eepenses(25000, 40000)             int g=100;
		int s=k-g;  //                                 int  s=k-g;
		j.HourlySalary();
		// @ override Tax3
		Hourly_salary r=new Tax3();
		r.yearlydp();
		
		
		System.out.println("Taxable income "+s);
		
	}
	
	public int income(int a) {
		
		System.out.println("my income is  "+a);
		
		return a;
		
// return is the LAST LINE 		
	}
	
	public int eepenses(int ex,int ot) {
		
	int	z=ex+ot;
		System.out.println("total expenses "+z);
		
		return z;
		
		
		
	}
	
	
	
	
	
}
