package com.osa.array;

import java.util.ArrayList;

public class DoubleArrayDemo {

	public static void main(String[] args) {
		array();
		int[][] a = { { 20, 21, 30 }, { 55, 999 }, { 150, 878, 56 } };
        int max=a[0][0];
        int secondMax=a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j]>max) {
					secondMax=max;
					max=a[i][j];
				}
			}
		}

	}
	
	public static void array() {
		
		ArrayList<String> name=new ArrayList<String>();
		name.add("p");
		System.out.println(name.get(0));
		
	}
	
}
