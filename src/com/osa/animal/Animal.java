package com.osa.animal;

public class Animal {
	public static void main(String[] args) {
		Animal k = new Animal();
		k.eat("food");

	}

	public void eat(String pub) {
		System.out.println("Animal eats   " + pub);
	}

	private void milk(String priv) {
		System.out.println("Gives milk ");
	}

	protected void cultivate(String prot) {

		System.out.println("Animal can cultivate ");
	}

	void StayAtHome(String defa) {

		System.out.println("Animals are domestic ");
	}

}
