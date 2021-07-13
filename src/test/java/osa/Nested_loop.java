package test.java.osa;

public class Nested_loop {

	public static void main(String[] args) {
		Nested_loop.sub(5, 25);
		Nested_loop.even(1, 10);
	}

	public static void sub(int startingNumber, int endNumber) {
		int total = 0;

		for (int i = startingNumber; i <= endNumber; i += 5) {

			total = total + i;

			System.out.println(i);

		}

		System.out.println(total);

	}

	public static void even(int startingNumber, int endNumber) {
		for (int i = startingNumber; i <= endNumber; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}

	}

}
//1 50