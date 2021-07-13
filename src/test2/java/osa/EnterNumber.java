package test2.java.osa;

//   https://www.youtube.com/watch?v=sMbDqDG56Zw&t=547s
import java.util.Scanner;

public class EnterNumber {

	public static void main(String[] args) {

	}

	void share() {
		// https://www.youtube.com/watch?v=sMbDqDG56Zw&t=547s
		// import Scanner + new Scanner(System.in) +(x= p.nextline;)
		Scanner input = new Scanner(System.in);

		int num1, num2, result;

		System.out.println("Enter first number : ");
		num1 = input.nextInt();

		System.out.println("Enter second number : ");
		num2 = input.nextInt();

		result = num1 + num2;
		System.out.println("sum  : " + result);

		result = num1 - num2;
		System.out.println("sub  : " + result);

		result = num1 * num2;
		System.out.println("mult  : " + result);

		result = num1 / num2;
		System.out.println("div  : " + result);

		result = num1 % num2;
		System.out.println("modulus  : " + result);

	}

}