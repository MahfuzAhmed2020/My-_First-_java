package test2.java.osa;

public class Hourly_salary {
	static int  x=500;
	public static void main(String[] args) {
		Hourly_salary j=new Hourly_salary();
		j.HourlySalary();
		j.yearlydp();
	}
    private static double yearlySalary(double ys) {
		
		System.out.println("yearlySalary  "+ys);
		return ys;
	}
	void HourlySalary() {
		double	hs=Hourly_salary.yearlySalary(150000)/52/40;
	    System.out.println("Hourly Salary   = "+hs);
	}
     protected static double deposit(double dp) {
	    return dp;
    }
    void yearlydp() {
	    System.out.println("Yearly deposit  = "+Hourly_salary.deposit(500)*52+" dollars");
    }
	
	

}
