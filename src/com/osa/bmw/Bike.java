package com.osa.bmw;

public class Bike extends Bmw {
	public static void main(String[] args) {
		Bmw k=new Bike();
		//Bike b=new Bike();
		
		k.engine();
		
		
	}
	
	@Override
	protected void engine() {
		System.out.println("bike engine ");
	}

}
