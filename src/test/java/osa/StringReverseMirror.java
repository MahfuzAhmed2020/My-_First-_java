package test.java.osa;

import java.util.Scanner;

public class StringReverseMirror {

	public static void main(String[] args) {
		StringReverseMirror k = new StringReverseMirror();
		// k.name();
		//k.mirroeReverse();
		//k.wordReverse();
		//k.sum();
		k.reverse();
	}

	Scanner input = new Scanner(System.in);
	//String name;
	int num;

	void reverse() {
		System.out.println("enter your name :");
		String name = input.nextLine();
		if (name.contains(" ")) {
			wordReverse(name);

		} else {
			mirroeReverse(name);

		}

	}

	void letterReverse(String name) {

		String m = "";
		for (int i = 0; i < name.length(); i++) {
			m = m + name.charAt(i);
		}
		System.out.println("Print letters : " + m);
	}

	public void wordReverse(String name) {

		String[] p = name.split(" ");
		String m = "";
		for (int i = p.length - 1; i >= 0; i--) {
			m = m + p[i] + " ";
		}
		System.out.println("wordReverse : " + m);
	}

	void mirroeReverse(String name) {
		String m = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			m = m + name.charAt(i);
			// String s = name.concat("i am from bd");
		}
		System.out.println("mirroeReverse : " + m);
	}

	void sum() {
		System.out.println("\nenter any number :");
		num = input.nextInt();
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			sum = sum + i;

		}
		System.out.println("\nsum  =  " + sum);
	}

}
