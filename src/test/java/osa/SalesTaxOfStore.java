package test.java.osa;

import test2.java.osa.Hourly_salary;

public class SalesTaxOfStore {
	static int a = 100; // global variable
	int x = 50;

	public static void main(String[] args) {
		Hourly_salary h = new Hourly_salary();
		a = 50;
		System.out.println();
		getName();
		display();
	}

	public static void getName() {
		a = 20;

	}

	public static void display() {
		int x = 10;
		System.out.println(a + x);
	}

	void go() {

		a = 10;
	}

}

/*
 * double grossIncome(double grossIncome) { return grossIncome; } void
 * expencess(int rent,int electricity,int gas,int employeeSalary,int
 * transportation) {}
 * 
 * totalcost=rent+electricity+gas+ }
 */