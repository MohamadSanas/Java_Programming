package lamda_EX;

public class Main {

	public static void main(String[] args) {
		/*test t1=new test() {
			public void display() {
				System.out.println("jhgkjf");
			}
		};
		
		t1.display();
		*/
		test t2= ()-> {
			System.out.println("the lamda expression");
		};
		
		t2.display();

	}
	

}
