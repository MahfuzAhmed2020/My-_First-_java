package test.java.osa;

public class StringSwap {
	public static void main(String[] args) {
		StringSwap.swap();
		StringSwap.stringSwap();
	}

	public static void stringSwap() {
		String a = "Hello";
		String b = "World";
		a = a + b;// HelloWorld
		
		b = a.substring(0, a.length() - b.length());// b=Hello
		
		a = a.substring(b.length());

		System.out.println("a= " + a);
		System.out.println("b= " + b);

	}

	public static void swap() {

		String x = " do it now";
		String y = " Go to action";

		// x = x + y;// do it now Go to action
		// y = x.substring(0, x.length() - y.length());
		// x = x.substring(y.length());

		// System.out.println("x= " + x + "\ny= " + y);

		System.out.println(x.toUpperCase());
	}
}