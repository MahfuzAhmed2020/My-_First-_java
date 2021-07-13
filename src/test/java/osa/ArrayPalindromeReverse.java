package test.java.osa;

import java.util.Scanner;

public class ArrayPalindromeReverse {
	public static void main(String[] args) {
		// reverseMirrorWordSentence();
		palindrom("madam");
		ReverseSentenceByWord("That is good");
	}

	public static void stringPlay() {
		int b = 5;
		String s = Integer.toString(b);

		// System.out.println(s+10);

		String k = "5";
		int a = Integer.parseInt(k);

		System.out.println(a + 10);
	}

	public static void palindrom(String sentence) {

		String reverse = "";
		for (int i = sentence.length() - 1; i >= 0; i--) {
			reverse = reverse + sentence.charAt(i);
		}
		if (sentence.equals(reverse)) {
			System.out.println("reverse = " + reverse);
			System.out.println(sentence + " is a palindrome");
		} else {
			System.out.println("reverse = " + reverse);
			System.out.println(sentence + " is not a palindrome");
		}

	}

	public static void ReverseSentenceByWord(String Sentence) {
		String word[] = Sentence.split(" ");
		System.out.println("Sentence is :" + Sentence);
		for (int i = word.length - 1; i >= 0; i--) {
			System.out.print(" " + word[i]);
		}
	}

//	public static void reverseMirrorWordSentence() {
//
//		Scanner input = new Scanner(System.in);
//		System.out.println("enter word or sentence  : ");
//		String sentence = input.nextLine();
//		if (sentence.contains(" ")) {
//			String a[] = sentence.split(" ");
//			//System.out.println("Sentence is :" + sentence);
//			for (int i = a.length - 1; i >= 0; i--) {
//				System.out.print( a[i]+" ");
//			}
//		} else {
//			String reverse = "";
//			for (int i = sentence.length() - 1; i >= 0; i--) {
//				reverse = reverse + sentence.charAt(i);
//				
//			}System.out.println( reverse);
//
//		}
//	}

	
	
	
	
	
	
	
	
	
	
	
	
}
