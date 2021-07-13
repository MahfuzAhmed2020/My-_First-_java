package test.java.osa;

public class LoopMaxNumber {

	public static void main(String[] args) {
		LoopMaxNumber.even();

		int[] num = { 55, 5, 4, 8, 7, 65, 78, 21, 45, 7, 9 };

		int min = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}

		}
		System.out.println("The minimum number is = " + min);

	}

	public static void even() {

		int[] num = { 1, 45, 58, 4, 63, 9, 45, 14, 27, 6 };
		int[] num2 = new int[num.length];
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < num.length; i++) {

			num2[i] = num[i];

			if (num2[i] % 2 == 0) {
				sum = sum + num2[i];

				System.out.println("even       " + num2[i]);

			} else if (num2[i] % 2 != 0) {
				sum1 = sum1 + num2[i];
				System.out.println("     odd           " + num2[i]);
			}

		}
		System.out.println("  and total is = " + sum);
		System.out.println("total odd =" + sum1);

	}

}
