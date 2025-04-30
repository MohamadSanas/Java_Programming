package Challange_06;

public class Employee extends Person {
	Employee(String name, int age, long SSN,String address){
		super(name,age,SSN,address);
	}
	void accName() {
		System.out.println(name);
	}
	
	void accAge() {
		System.out.println(age);
	}
	
	void accsocialSecurityNumber() {
		//System.out.println(SecurityNumber);
		
	}
	
	void accAddress() {
		System.out.println(address);
	}
	
}
