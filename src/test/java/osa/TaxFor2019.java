package test.java.osa;

public class TaxFor2019 {
	
	
	public static void main(String[] args) {
		TaxFor2019 myObj=new TaxFor2019();
		myObj.tax();
		System.out.println();
// Use myObj to access and print the value of the x attribute of TaxFor2019.
		System.out.println("The value of the x attribute of TaxFor2019 = "+myObj.x);
		
		}
    static double grossIncome(double gIncome){
		System.out.println("grossIncome  = "+gIncome);
		return gIncome;
	}
	static double expenses(double gas,double maintenance,double toll,double insurance) {
	double	totalE=gas+maintenance+toll+insurance;
	System.out.println("totalE  = "+totalE);
	return totalE ;
	}
	static double taxableIncome() {
		double	taxableIncome=TaxFor2019.grossIncome(100000)-TaxFor2019.expenses(10000, 5000, 3000, 4000);
		System.out.println("taxableIncome  = "+taxableIncome);
		return taxableIncome;
	}
	void tax() {
		double tax=TaxFor2019.taxableIncome()*0.25;
		System.out.println("tax  = "+tax);
	}
	
	//Use the addition assignment operator to add the value 5 to the variable x.
	int x=10;
	//x+=5;  // x=x+5;
// The class below should not be inherited by other classes.
	// final class MyClass
	
	
	
}
