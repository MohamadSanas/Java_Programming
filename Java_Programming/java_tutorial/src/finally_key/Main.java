package finally_key;
import java.util.Scanner;

class ageLimit extends Exception{
	public ageLimit(String s){
		super(s);	
	}
}


public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Welcome to the club.\n Enter your age: ");
		
		try {
			int age = input.nextInt();
			input.close();
			if(age<0)
				throw new ArithmeticException("Age scan not be less than 0");
			if(age<18) {
				throw new ageLimit("Age should be greater than 18");
			}
		}
		
		catch(Exception e){
			System.out.println(e);
			
		}
		
	
		
		finally {
			System.out.println("Programme ended");
		}
		
		input.close();

	}
	

}
