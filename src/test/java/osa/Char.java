package test.java.osa;

public class Char {
	public static void main(String[] args) {
		Char.fa();
	}

	public static void fa() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);

			for (char ch1 = 'b'; ch1 >= 'a'; ch1--) {
				System.out.println(ch1);
				
			}
		}
		System.out.println(Math.random());
	}

}
