package com.osa.array;

public class DoubleArray {
public static void main(String[] args) {
	DoubleArray.ar();	
	DoubleArray.arrr();
}
    public static void arrr() {
    	System.out.println();
	int [][] j= { {12,124,14,5 },  {45,8,6},   {54,7,1}   };
	for(int i=0;i<j.length;i++) {
		for(int k=0;k<j[i].length;k++) {
		System.out.println(j[i][k]);	
	  }	
	}

   }

	/*
	int[]g= {100,200,500,250,122,111,571};
    int  sum=0;
	for(int i=0;i<g.length;i++) {
	if(g[i]%2==0) {
			sum=sum+g[i];	
		}
		System.out.println(i+"  "+ g[i]+"  sum  = "+sum);	
	}
	//System.out.println("sum  = "+sum);
	
    }
*/
    public static void ar() {
    	
		String [][] nm= {{"iftikhar","ahmed","abrar"},{"A","B"},{"D"}};
		for(int i=0;i<nm.length;i++) {
			for(int j=0;j<nm[i].length;j++) {
				System.out.print("\n"+i+" "+j+"  "+nm[i][j]);
			}
		}
	}		
   }
