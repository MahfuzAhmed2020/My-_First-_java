package test.java.osa;

public class StoreExpTax {
	int age, mobile;
	String name; // global variable

	void address(int ag, int mb, String nm) {
		age = ag;
		mobile = mb;
		name = nm;
		System.out.println("My name is " + name + "\nMy age is " + age + "\nMy mobile number is " + mobile);
		System.out.println();

	}

	/*
	 * Constructor Parameters:- Constructors can also take parameters, which is used
	 * to initialize attributes.
	 * 
	 * The following example adds an int y parameter to the constructor. Inside the
	 * constructor we set x to y (x=y). When we call the constructor, we pass a
	 * parameter to the constructor (5), which will set the value of x to 5:
	 */
	/*
	 * void displayAddress() {
	 * 
	 * }
	 */

	public static void main(String[] args) {

		StoreExpTax k = new StoreExpTax();
		k.address(25, 123456, "ABRAR");
		k.address(33, 347357221, "iftikhar");
		k.address(11, 34544, "ahmed");

		/*
		 * StoreExpTax k=new StoreExpTax(); k.address(30, 132566, "abrar");
		 * k.displayAddress(); System.out.println(); k.address(25, 12, "ifti");
		 * k.displayAddress(); System.out.println(); k.address(28, 347478455, "ahmed");
		 * k.displayAddress();
		 */

		/*
		 * StoreExpTax k=new StoreExpTax(); k.address(33, 123456, "ABRAR");
		 * k.displayAddress(); k.address(25, 1255, "iftikhar"); k.displayAddress();
		 */
	}

}
