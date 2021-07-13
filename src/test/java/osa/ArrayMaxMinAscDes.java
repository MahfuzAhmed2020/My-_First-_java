package test.java.osa;

public class ArrayMaxMinAscDes {
	public static void main(String[] args) {
		ArrayMaxMinAscDes k = new ArrayMaxMinAscDes();
		k.add();
		k.max();
		k.maximumMinimumAscendingDescending();
		int[] n = { 20, 25, 2, 4050, 88, 66, 2, 88, 2, 88, 2, 88 };
		System.out.println("Largest:" + getLargest(n));
		k.minNumberArr();

	}

	public static int getLargest(int[] a) {
		int temp;
		//int[] a = { 20, 25, 2, 4050, 88, 66, 2, 88, 2, 88, 2, 88 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		// System.out.println("Largest:"+getLargest(a));
		return a[(a.length) - 1];// a[9]
	}

	public void maximumMinimumAscendingDescending() {
		int[] r = { 12, 145, 102, 55, 12, 45, 96, 120, 44, 10 };

		int temp = 0;
		for (int i = 0; i < r.length; i++) {
			for (int j = i + 1; j < r.length; j++) {
				if (r[i] > r[j]) {
					temp = r[i];
					r[i] = r[j];
					r[j] = temp;
				}
			}
			System.out.println(r[i] + " ");
		}
		System.out.println("max = " + r[r.length - 1]);
		System.out.println("min = " + r[0]);

	}

	void add() {
		int[] a = { 20, 25, 2, 40, 88, 66, 2, 88, 2, 88, 2, 88 };
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
				// System.out.println(i+" "+j+" "+temp+" "+a[i]+" "+a[j]);
			}
			System.out.println(a[i]);

		}

	}

	void max() {
		int[] a = { 20, 25, 2, 40, 88, 200, 66, 2, 88, 2, 88, 2, 99 };
		int max = a[0];
		int secondMax = a[0];

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > max) {// 20 >25
					secondMax = max;
					max = a[i];
				}
			}

		}
		System.out.println("max  " + max + " secondMax  " + secondMax);

	}

	public static void minNumberArr() {
		int[][] arr = { { 5, 3, 7 }, { 9, 10, 4 }, { 2, 4, 8 } };
		int min = arr[0][0];
		int colnum = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
					colnum = j;
				}

			}
		}
		System.out.println("miniun number is this array: " + min);

		int max = arr[0][colnum];
		for (int k = 0; k < 3; k++) {
			if (max < arr[k][colnum]) {
				max = arr[k][colnum];

			}
		}
		System.out.println("maximum number of min number's column is: " + max);
	}
}
