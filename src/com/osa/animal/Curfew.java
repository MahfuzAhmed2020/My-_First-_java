package com.osa.animal;

public class Curfew {
	//method variable
	
	int x=1200; // global variable = inside the class.
	
	
	public static void main(String[] args) {
		//object create :- call by class + name it=new class name();
		
		
		int a,b; //declare variable
		double c,d;
		
		a =20; // create variable
		b=30;
		c=15.50;
		d=25.50;   //local variable = inside the method
		
	double	z =a+c;
	System.out.println("Total = "+z);
		
	Curfew k=new Curfew();
	k.blasio(20, 25.50);
	k.add();
	k.name();
	k.address("ABRAR", 13456985544L, 11372);
	
	
	}
	//access modifier(return type)+ method name+ method sign+ building block. example:- void blasio() {}
	//[parameterize = when we don't have variable BUT we know what to do.
	void blasio(int a,double b) {
	
		double z=a+b;
		
		System.out.println("sum = "+z);
		
		}
	
	void add() {
		
		System.out.println("I'm the best");
	}
	
	void name() {
		System.out.println("ibrahim");
		
	}
	void address(String name,long mobile,int zip) {
		
		System.out.println("My name is "+name+"\nMy mobile number is  "+mobile+"\nZip code "+zip);
	}
	
	

}
