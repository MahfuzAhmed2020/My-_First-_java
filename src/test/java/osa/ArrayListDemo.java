package test.java.osa;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	public static void main(String[] args) {
		//ald();
	}

	public static void ald() {
		ArrayList<String> a = new ArrayList<String>();
		 ArrayList<String> b= new ArrayList<String>();
		 
		a.add("add");
		a.add("whiteChocolate");
		a.add("coffee");
		a.add("espresso");
		
		Collections.sort(a);
		for(String r:a) {
			System.out.println("Sort Array  : "+r);
		}
		for (int i = 0; i < a.size(); i++) {
			System.out.println("Array for loop print : " +" ["+i+"] "+ a.get(i));
		}
		System.out.println("Set Array : "+a.set(1, "GreenTea"));
		System.out.println("ArrayList print : " + a);
		System.out.println("Array index : a.get(index) : " + a.get(2));
		System.out.println("Array Size : " + a.size());
		for (String p:a) {
			System.out.println("For each loop : "+p);
		}
		

	}

}
