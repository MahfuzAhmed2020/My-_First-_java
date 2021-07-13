package test2.java.osa;

public class Today {
	//class method variable
	//you can add many methods inside the class
	public static void main(String[] args) {
		Today t =new Today();
		
		t.add();
		MyStack m=new MyStack();
		
		m.push(0);
		IfElse i=new IfElse();
		i.eve();
		Today o =new Today();
		o.Else();
		Today j=new Today();
		j.sub();
		
		
	
	}
	
	
	void add() { 
	
	
	
int	x=10;
int y=20;
 int z= x+y;
	 
	System.out.println("total  "+z);
	System.out.println("C\tA\tB\nD\tE\tF");
	
	
	
	
	}
	void sub() {int a,b,c; 
    a = 5; 
    b = 9; 
    c = a - b; 
if (c >= 0)  System.out.println("c is a positive number");
   if (c < 0) System.out.println("c is a negative number");
   c = b - a; 
   if (c >= 0) System.out.println("c is a positive number"); 
   if (c < 0) System.out.println("c is a negative number");
		
   int count; 
   for(count = 1; count < 10; count = count+1) 
   System.out.println("This is count: " + count); 
   System.out.println("Done!");
		
		
//Instead of count = count+1, this increments the counter, we can use count+
		
		
		
		
		
		
		
		
		
		/*if(d != 0 && (n % d) == 0) 
		 System.out.println(d + " is a factor of " + n); 
	 d = 0; // now, set d to zero 
	 // Since d is zero, the second operand is not evaluated. 
	 if(d != 0 && (n % d) == 0) 
	 System.out.println(d + " is a factor of " + n); 
	  Now, try same thing without short-circuit operator. 
	 This will cause a divide-by-zero error. 
	 */}
	void Else() { boolean p, q; 
	 System.out.println("P\tQ\tice\twater\tsnow\tvapour"); 
	 p = true; q = true; 
	 System.out.print(p + "\t" + q +"\t"); 
	 System.out.print((p&q) + "\t" + (p|q) + "\t"); 
	 System.out.println((p^q) + "\t" + (!p)); 
	 p = true; q = false; 
	 System.out.print(p + "\t" + q +"\t"); 
	 System.out.print((p&q) + "\t" + (p|q) + "\t"); 
	 System.out.println((p^q) + "\t" + (!p)); 
	 p = false; q = true; 
	 System.out.print(p + "\t" + q +"\t"); 
	 System.out.print((p&q) + "\t" + (p|q) + "\t"); 
	 System.out.println((p^q) + "\t" + (!p)); 
	 p = false; q = false; 
	 System.out.print(p + "\t" + q +"\t"); 
	 System.out.print((p&q) + "\t" + (p|q) + "\t"); 
	 System.out.println((p^q) + "\t" + (!p));
		
	}
	
	}
