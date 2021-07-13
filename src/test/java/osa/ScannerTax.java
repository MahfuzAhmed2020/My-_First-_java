package test.java.osa;

import java.util.Scanner;


public class ScannerTax {
public static void main(String[] args) {
	
	
	Scanner input=new Scanner(System.in);
	System.out.println("enter your gross income ");
	double gIncome=input.nextDouble();
	
	System.out.println("expenses ");
 double	ex=input.nextDouble();
 
 System.out.println("gas = "+ex);
 double	ex1=input.nextDouble();
 System.out.println("toll = "+ex1);
 double	ex2=input.nextDouble();
 System.out.println("wash = "+ex2);
 double	ex3=input.nextDouble();
System.out.println("others = "+ex3);
 
 
 
	double totalCost=ex+ex1+ex2+ex3;
	System.out.println("totalCost = "+totalCost);
	
	double taxableIncome=gIncome-totalCost;
	System.out.println("taxableIncome = "+taxableIncome);
	double tax=taxableIncome*0.25;
	System.out.println("tax = "+tax);
	
	
	
	
	
	
	

}
	
 





}