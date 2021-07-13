package test.java.osa;

import java.util.Scanner;

public class If_Else_Statement {

	public static void main(String[] args) {
		// If_Else_Statement.getDay("monday");
		// If_Else_Statement.getDay("saturday");

		If_Else_Statement k = new If_Else_Statement();
		// k.getMarks();
		k.getDay("sunday");
		// k.getDay();
		// k.temp();
		// k.temp(70);
		// k.getMarks();

		/*
		 * k.getMarks(100); k.getMarks(72); k.getMarks(65); k.getMarks(52);
		 * k.getMarks(33); k.getMarks(22); k.getMarks(101);
		 * If_Else_Statement.getDay("saturday");
		 */

	}

	public void getMarks(/* double marks1 */) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your mark  : ");
		double marks1 = input.nextDouble();

		if (marks1 >= 80 && marks1 <= 100) {
			System.out.println("Your Mark is " + marks1 + "\nand Your grade is A+");
			System.out.println();

		} else if (marks1 >= 70 && marks1 <= 79) {

			System.out.println("Your Mark is " + marks1 + "\nand Your grade is A");

		} else if (marks1 >= 60 && marks1 <= 69) {

			System.out.println("Your Mark is " + marks1 + "\nand Your grade is B");
		} else if (marks1 >= 50 && marks1 <= 59 /* 50<=marks1<=59 */) {
			System.out.println("Your Mark is " + marks1 + "\nand Your grade is C");
		} else if (marks1 >= 33 && marks1 <= 49) {
			System.out.println("Your Mark is " + marks1 + "\nand Your grade is D");
		} else if (marks1 >= 0 && marks1 <= 32) {
			System.out.println("Your Mark is " + marks1 + "\nand Your grade is D");
		} else {
			System.out.println("invalid");
		}

	}

	public static void getDay(String day11) {
		/*
		 * Scanner input =new Scanner(System.in);
		 * 
		 * System.out.println("enter the day "); String day11=input.next();
		 */
		// System.out.println("Today is : "+day11);

		if (day11 == "monday" || day11 == "tuesday" || day11 == "wednesday" || day11 == "thursday"
				|| day11 == "friday") {
			System.out.println(day11 + "  is  Weekday");
		} else if (day11 == "saturday" || day11 == "sunday") {
			System.out.println(day11 + "  Have a great Weekend");
		} else {
			System.out.println("invalid");
		}

	}

	public static void temp(int temp1) {

		if (temp1 >= 80 && temp1 <= 90) {
			System.out.println("Temperature is " + temp1);
			System.out.println("It's sunny day");
		} else if (temp1 >= 91 && temp1 <= 104) {
			System.out.println("Temperature is " + temp1);
			System.out.println("It's very hot.");
		} else if (temp1 >= 70 && temp1 <= 79) {
			// System.out.println("Temperature is "+temp1);
			System.out.println("It's awesome outside. ");
		} else if (temp1 >= 60 && temp1 <= 69) {
			System.out.println("Temperature is " + temp1);
			System.out.println("It's feel like spring");
		} else {
			System.out.println("Temperature is " + temp1);
			System.out.println("Invalid tempetature");
		}

	}

}

/*
 * Scanner input=new Scanner(System.in);
 * System.out.print("Enter the Temperature  : "); double
 * temp1=input.nextDouble();
 */
/*
 * /*Scanner input=new Scanner(System.in);
 * System.out.print("Enter the Temperature  : "); double
 * temp1=input.nextDouble();
 */
/*
 * Scanner input=new Scanner(System.in);
 * System.out.print("Enter your mark  : "); double marks1=input.nextDouble();
 */
