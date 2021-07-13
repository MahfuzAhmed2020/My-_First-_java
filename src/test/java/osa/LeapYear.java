package test.java.osa;

public class LeapYear {
	public static void main(String[] args) {
		LeapYear.lp(2001, 2020);
	}

	public static void lp(int year1, int year2) {

		for (year1 = year1; year2 >= year1; year1++) {
			if (year1 % 4 == 0) {
				System.out.println("Leap year   " + year1);
			} else if (year1 % 4 != 0) {
				System.out.println("Not A Leap year " + year1);
			}

		}

	}
}

/*
 * if(year1%4==0) { System.out.println("Leap year "+year1); } else
 * {System.out.println("Not a Leap year ");}
 */