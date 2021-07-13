package com.osa.animal;

public class Salat {

	public static void main(String[] args) {
		char ch='a';
		if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o' || ch=='u') 
		{System.out.println("Work on yourself.\nNOT on others.");}
		else System.out.println("not good");
		Salat s=new Salat();
		s.swtch();
		s.brk();
		char v='a';
		int x=50;
		int y=800;
		int z=v+x+y;
		System.out.println(z);
		
		
		}
	void swtch() {
		int x=2;
		switch(x) {
		case 1: System.out.println("Bangladesh");
		case 2:System.out.println("USA");
		default:
			System.out.println("Out of earth");
            //on off like light switch
			//if one answer is correct IT SHOWS NEXT ALL ANSWERS
			}}
	
void brk() {
	int x=3;
	switch(x) {
	case 1: System.out.println("Bangladesh");
	break;
	case 2:System.out.println("USA");
	break;
	case 3:System.out.println("CANADA");
	break;
	default:
		System.out.println("Out of earth");}
	
	}








}
