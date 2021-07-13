package test2.java.osa;

public class IfElse {
	public static void main(String[] args) {
		IfElse i = new IfElse();
		i.vowel();

		int b = 1000;
		if (b % 2 == 0 || b % 5 == 0) {
			System.out.println("ok");
		}
	}

	void vowel() {
		// logical word DOUBLE PIPELINE

		// write a program which will take a positive integer and print where the
		// integer is EVEN or ODD.
		char ch = 'p';
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("vowel");
		} else {
			System.out.println("Consonent");
		}
	}

	void eve() {
//write a program which will take a positive integer and print whether the integer EVEN or ODD.
		int num = 45;
		if (num % 2 == 0) {
			System.out.println("EVEN");
		} else {
			System.out.println("ODD");
		}

	}

}

/*
 * public static void main(String[] args) { IfElse i= new IfElse(); i.greater();
 * 
 * 
 * 
 * int x=20; if(x % 2==0 && x %5==0) {System.out.println("ok");} } void
 * greater() { int a=200; if(a<100 && a>300) { System.out.println("Action");
 * }else {System.out.println("CUT");} }
 * 
 * 
 * 
 * void large() { int x=900; if(x % 5) {}
 */
