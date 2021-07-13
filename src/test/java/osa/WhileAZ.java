package test.java.osa;

public class WhileAZ {
	public static void main(String[] args) {
		// WhileAZ.AZ();
		// WhileAZ.whl();
		WhileAZ.dhld(200);
	}

	public static void AZ() {

		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println(i);
		}
	}

	public static void whl() {
		char i = 'A';
		while (i <= 'Z') {
			System.out.println(i);
			i++;
		}
	}

	public static double dhld(double payment) {

		double tips = payment * 0.20;
		System.out.println("tips = " + tips);
		return tips;

	}
}
