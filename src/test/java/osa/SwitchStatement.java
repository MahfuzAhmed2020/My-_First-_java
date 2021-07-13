package test.java.osa;

public class SwitchStatement {
	public static void main(String[] args) {
		SwitchStatement.findday("monday");
	}
	
	
	public static void findday(String day) {
		switch(day) {
		case "monday" :
			System.out.println("Today is monday");
			break;
		case "tuesday" :
			System.out.println("Today is tuesday");
			break;
			
		case "wednesday" :
			System.out.println("Today is wednesday");
			break;
				
		case "thursday" :
			System.out.println("Today is thursday");
			break;
		
		case "friday" :
			System.out.println("Today is monday");
			break;
			
		default:
				System.out.println("invalid");
		}
		
	}

}
