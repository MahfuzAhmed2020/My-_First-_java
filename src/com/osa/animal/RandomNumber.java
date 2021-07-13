package com.osa.animal;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random r=new Random();
		int a=(int) (Math.random()*10);
		
		System.out.println(a);
		
		
		/*Random random=new Random();
int a = random.nextInt(10)+1; //from 1 to 10 // from 10 to 100 --
(90)+10
System.out.println(a);
//or Using Math class
int b= (int) (Math.random()*10); //from 0 to 9 // from 1 to 10 --
*10+1
System.out.println(b);*/
	}
}
