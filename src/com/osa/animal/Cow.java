package com.osa.animal;

public class Cow extends Animal{
	
	public static void main(String[] args) {
		Animal a=new Cow ();
		a.eat(" food ");
		
	}
	
	//@ override  
public void eat(String pub) {
		
		System.out.println("Cow eat "+pub);
	}
	
	void cow() {
		
		System.out.println("Cow eat grass ");
	}
	
void dog() {
		
		System.out.println("Dog barks ");
	}
	
}
