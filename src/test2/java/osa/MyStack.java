package test2.java.osa;

public class MyStack {
	int capacity = 3;
	int[] stack = new int[capacity];
	int top = -1;

	/*
	 * int x=500,y=900, z=1200; char ch ='a';
	 */
	void push(int x) {

		if (top < capacity - 1) {

			top = top + 1;
			stack[top] = x;

			System.out.println("syccessfully added :" + x);
		} else {
			System.out.println("Exception! stack Overflow.");

		}

	}

	void pop() {
		/*
		 * if(top<0) {System.out.println("Exception stack underflow");return-1
		 * 
		 * }
		 */
	}

	void peek() {

	}

	public static void main(String[] args) {
		System.out.println("Implementing my stack.");
	}

}
