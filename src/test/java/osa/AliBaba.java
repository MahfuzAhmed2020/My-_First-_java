package test.java.osa;

public class AliBaba {

	public static void main(String[] args) {

		AliBaba k = new AliBaba();
		k.add();
		k.sub();
		// int n=g+f;
		int j = k.add() + k.sub();
		System.out.println("p+z  = " + j);
		AliBaba.sub();
		System.out.println("static    = " + AliBaba.add());
	}

	static public int add() {
		AliBaba.sub();
		int x = 5;
		int y = 10;
		int z = x + y;
		System.out.println("total z = " + z);
		return z;
	}

	static int sub() {
		int x = 50;
		int y = 30;
		int p = x - y;
		System.out.println("total p = " + p);

		return p;
	}

	// access modifier :- public
	// non access modifier :- static , private

}
