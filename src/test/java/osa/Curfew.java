package test.java.osa;

public class Curfew {
	
	public static void main(String[] args) {
		
		Curfew k=new Curfew();
		k.getNumber();
		k.getInfo(20000, 50000, 50000);
  int totalEarning =k.income(10000, 30000, 120000);
	int totalCost =k.expenses(6000, 6000, 17000, 1600);
	int totalDeposit =totalEarning-	totalCost;
	
	
	System.out.println("totalDeposit  = "+totalDeposit);
	k.bool(18, 13)	;
	}
	
// for regular void method :- when we have DATA and we know the ACTION.
static public void	getNumber() {
	int x= 500;
	int y=1200;
	int sum=x+y;
	System.out.println("sum = "+sum) ;
		
}
//  for parameterized method:- when we don't have DATA but we know the ACTION.
	public void getInfo(int salary,int income,int cost) {
		
		int totalSavings=salary+income-cost;
		System.out.println("totalSavings  = "+totalSavings);
		
	}
	// for return :- when we don't have DATA and we don't know the ACTION and we REUSE the method.
	public int income(int grossIncome,int otherIncome,int salary) {
		
		int totalIncome=grossIncome+otherIncome+salary;
		System.out.println("totalIncome    = "+totalIncome);
		return totalIncome;
		
	}
	public int expenses(int rent,int car,int utility,int conedi) {
		int totalExp=rent+car+utility+conedi;
		System.out.println("totalExp  = "+totalExp);
		return totalExp;
		
		
	}
	//53 keywords we can't use as method,variable,class name.ex int,void ,this,static,public.....
	boolean bool(int constant ,int age2) {
		boolean vote=constant<age2;
			
		System.out.println("if your age is more than "+constant+" than you can  vote. "+vote);
		return vote;
		
		
	}
	
	
	
	

}
