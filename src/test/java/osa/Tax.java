package test.java.osa;
//89 https://www.youtube.com/watch?v=K3RXf7IMwWs&list=PLgH5QX0i9K3oAZUB2QXR-dZac0c9HNyRa&index=88
public class Tax extends Curfew {
public static void main(String[] args) {
	
	Tax k=new Tax();
	k.tax();
	k.bool(18, 13);
	Curfew.getNumber();
	System.out.println();
	
 }
	static double grossIncome(double income) {
		return income;
	}
	static int expences(int gas,int toll,int carWash,int others) {
	int	totalCost= gas+toll+carWash+others;
	System.out.println("total expences = $ "+totalCost);
	     return totalCost;
	}
	static int dependent(int familySize) {
		int fExp=familySize*1200;
		System.out.println("dependent = $ "+fExp);
		return fExp;
	}
	static int taxableIncome() {
		int taxInc=(int) (Tax.grossIncome(70000)-Tax.expences(2500, 7000, 26900, 22000)-Tax.dependent(3));
		System.out.println("taxableIncome =$ "+taxInc);
		return taxInc;
	}
	static double tax() {
		double  fTax=Tax.taxableIncome()*0.25;
		System.out.println("Tax to the GOV = $ "+fTax);
		return fTax ;
	}
	
	
	
	
}
