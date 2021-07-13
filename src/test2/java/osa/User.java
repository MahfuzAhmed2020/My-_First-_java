package test2.java.osa;
//    https://www.youtube.com/watch?v=sMbDqDG56Zw&list=PLgH5QX0i9K3oAZUB2QXR-dZac0c9HNyRa&index=11
import java.util.Scanner;

public class User {
	public static void main(String[] args) {
//     https://www.youtube.com/watch?v=sMbDqDG56Zw&list=PLgH5QX0i9K3oAZUB2QXR-dZac0c9HNyRa&index=11
		//import Scanner + new Scanner(System.in) +(x= p.nextline;)
		
		Scanner input=new Scanner(System.in);
		
		String name;
		
		System.out.print("Enter your name  :  ");
		name =input.nextLine();
		
		System.out.println("Welcome  : "+name);
		User u=new User();
		u.scnr();
		NameEntry n=new NameEntry();
		n.add("MAHFUZ");
		EnterNumber o=new EnterNumber();
		o.share();
		
		
		
	
		}
	

	void scnr() {
       Scanner input=new Scanner(System.in);
		
		int number;
		System.out.print("Enter any number  :  ");
		
		number = input.nextInt();
		
		System.out.println("number = "+number);
		
		
		
		
	}
	
	
	
	
	
}
