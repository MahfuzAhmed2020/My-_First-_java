package test.java.osa;

public class Circle_Square {
	
	
	double circle(int radius) {
		
		double areaOfTheCircle=3.1416*radius*radius; 
		
		System.out.println("areaOfTheCircle "+areaOfTheCircle);
		
		return areaOfTheCircle;
	}
	
	double square(double base){
		
		double areaOfTheSquare=base*base;
		double p=Circle_Square.triangle(5.5, 10.5);
		System.out.println("Area Of The Triangle  "+p);
		
		return areaOfTheSquare;
		}
	static double triangle(double height,double base){
		
		double areaOfThetriangle=0.5*base*height;
		System.out.println("areaOfThetriangle  "+areaOfThetriangle);
		return areaOfThetriangle;
		
	}
	double feetInch(double ft,double in){
		
		double convertFTtoIN=12*in+in;
		System.out.println("convertFTtoIN  ="+convertFTtoIN+"inch");
		return convertFTtoIN;
	}
	
	 public static void main(String[] args) {
		Circle_Square k= new Circle_Square();
		double p=k.square(10);
		System.out.println(p);
		k.circle(120);
		System.out.println(k.circle(120));
		k.feetInch(5, 5);
		
	
		
		
		
		
	}
	
	
	
	
	

}
