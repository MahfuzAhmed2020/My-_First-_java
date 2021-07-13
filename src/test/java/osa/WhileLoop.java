package test.java.osa;

public class WhileLoop {

	public static void main(String[] args) {
		WhileLoop.ev(1, 100);

	}

	public static void ev(int sn, int en) {
		int i = sn;
		while (i <= en) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
