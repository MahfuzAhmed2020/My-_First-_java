package test2.java.osa;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		SwitchDemo k=new SwitchDemo();
		k.add();
	}

	public void add() {
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter any day ");
		int day=input.nextInt();

		switch (day) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
			default:
				System.out.println("out of service");

		}
	}
	
	

}
