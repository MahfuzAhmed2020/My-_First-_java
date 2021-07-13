package com.osa.constructor;

public class Const_demo {

	int age;
	String name;

	Const_demo() {
	}

	Const_demo(int age, String name) {

		this.name = name;
		this.age = age;
		System.out.println("My name is " + name + "\nand my age is " + age);
	}

	public int getAge() {
		return age;
	}


	public String getName() {
		return name;
	}

	

}
