package test.java.osa;

import java.util.Scanner;

public class CalculatorByScanner {
	public static void main(String[] args) {
		add();
	}
	
	public static void add() {
		String yn;
		do {
			Scanner input =new Scanner(System.in);
			double numberOne,numberTwo;
			System.out.println("insert first number");
			numberOne=input.nextDouble();
			System.out.println("insert(+,-,*,/)");
			String symbol=input.next();
			System.out.println("insert second number");
			numberTwo=input.nextDouble();
			double result;
			switch(symbol ) {
			case "+":result=numberOne+numberTwo;
			System.out.println("The result is =  "+result);
			break;
			case "-":result=numberOne-numberTwo;
			System.out.println("The result is =  "+result);
			break;
			case "*":result=numberOne*numberTwo;
			System.out.println("The result is =  "+result);
			break;
			case "/":result=numberOne/numberTwo;
			System.out.println("The result is =  "+result);
			break;
			default:
				System.out.println("enter valid number");
			//break;
			}
			//System.out.println("total is "+(numberOne+numberTwo));
			//return c+p;
		
		System.out.println("do you want to continue?(press y for yes/ n for no) " );	
		yn=input.next();
		
		}while(yn.equals("Y")||yn.equals("y")||yn.equals("n")||yn.equals("N"));
	}
public  int sub(int a,int b) {
		
		return a-b;
	}
	public  int multi(int a,int b) {
		
		return a*b;
	}
	public  int div(int a,int b) {
		
		return a/b;
	}

}
