package test.java.osa;

public class StringDemo1 {
	String name = "Iftikhar Ahmed Abrar ";
	String lc = "Hi this is our last string class";

	public static void main(String[] args) {
		StringDemo1 p = new StringDemo1();
		p.add();
		p.rev();
	}

	public void add() {

		String[] k = name.split(" ");
		String rev = " ";

		for (int i = k.length - 1; i >= 0; i--) {
			rev = rev.concat(k[i]).concat(" ");

		}
		System.out.print(rev);

	}

	public void rev() {

		for (int j = lc.length() - 1; j >= 0; j--) {

			System.out.print(lc.charAt(j));
		}

	}

}
