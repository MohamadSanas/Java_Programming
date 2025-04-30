package challange_7;

public class AgeValidator {
	
	public void chekAge(int age) {
		try {
			if(age<0||age>150) {
				throw new invalidAgeException("invalid age for programme");
			}
			
			System.out.println("Suitable age");
		}
		
		catch (Exception e){
			System.out.println(e);
		}
	}

}
