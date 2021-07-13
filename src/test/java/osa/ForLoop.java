package test.java.osa;

public class ForLoop {
public static void main(String[] args) {
	//ForLoop.sw(19);
	ForLoop.odd();
	/*for(int i=10;i>=0;i-=2) {
		System.out.println(i);
	}*/
}
public static void odd() {
	//     1          2             4
	//initialization condition  increment/decrement
	for (int i=9;    i>=1;         i-=1){
		//                3
		System.out.println(i);
	}
	//  i+=2    i=i+2
	//i+=1      i=i+1
	//i++       i=i+1
	}
public static void sw(int day) {
	
	switch(day) {
	
	case 13 :
		System.out.println("today is saturday "+day+"th june 2020");
	//break;
	case 14 :
		System.out.println("today is sunday "+day+"th june 2020");
	//break;
	case 15 :
		System.out.println("today is monday "+day+"th june 2020");
	//break;
	case 16 :
		System.out.println("today is tuesday "+day+"th june 2020");
	//break;
	case 17 :
		System.out.println("today is wednesday "+day+"th june 2020");
	//break;
	case 18 :
		System.out.println("today is thursday "+day+"th june 2020");
	//break;
	case 19 :
		System.out.println("today is friday "+day+"th june 2020");
	break;
	default:
	System.out.println("No match found");
	
	}
   }

}
