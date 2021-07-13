package test2.java.osa;

public class Cow {
	public static void main(String[] args) {
		int x=500;
		int y=1200;
		int z=x+y;
		
		System.out.println("Total = "+z);
		Cow p=new Cow();
		p.add(200, 100);
		p.sub("ABRAR");
		p.address("IFTIKHAR AHMED ABRAR", 2, "NARSINGDI", 1600);
		
		
	}
//PARAMETERISED:- when we know what to do , but we don't have value of the variable	
// The DATA TYPE of the return = RETURN TYPE of the METHOD 	
	public int add(int a,int b) {
		
		
		
		
		int c=a+b;
		
		System.out.println("Total c = "+c);
		return c;
		
	}
	public void sub(String name){
		
		System.out.println("My name is "+name);
		
		
	}
	
	public void address(String name,int age,String home,int zip) {
		
		System.out.println("My name is "+name+"   my age is "+age+"  I live in "+home+"   area code "+zip);
		
	}
	
	
	
	
	
	

}
