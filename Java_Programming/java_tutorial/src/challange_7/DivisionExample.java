package challange_7;

public class DivisionExample {
	public void divideNumbers(int numerator, int denominator) {
		try {
			int result=numerator/denominator;
			
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("Can not divid by 0");
			
		}
		
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
