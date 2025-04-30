package Challange_06;

public class Person {
	public String name;
	protected int age;
	private long socialSecurityNumber;
	String address;
	
	Person(String name, int age, long SSN,String address){
		this.name=name;
		this.age=age;
		this.socialSecurityNumber=SSN;
		this.address=address;
	}
	
	void getSSN() {
		System.out.println(socialSecurityNumber);
	}

}
