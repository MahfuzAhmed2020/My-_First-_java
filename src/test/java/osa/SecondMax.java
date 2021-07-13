package test.java.osa;

public class SecondMax {

	public static void main(String[] args) {
		SecondMax.max();
	}

	public static void max() {

		int[] x = { 3, 5, 27, 9, 11, 13, 15, 17 };
		int max = x[0];
		for (int i = 1; i < x.length; i++) {
			if (max < x[i]) {
				max = x[i];
			} else if (x[i] < max && x[i] > max) {

				int secondMax = x[i];
				System.out.println("secondMax " + secondMax);
			}

		}
		System.out.println("max =" + max + "\nindex =" + x.length);

	}

}
