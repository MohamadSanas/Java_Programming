package Q1;




class Person{
	public String name;
	protected int age;
	private String SocialSecurityNum;
	String address;
	 
	Person(String name, int age, String ssn,String add){
		 this.name=name;
		 this.address=add;
		 this.SocialSecurityNum=ssn;
		 this.age=age;
		 
		 
	 }
	
	
	void display_ssn() {
		 System.out.println(SocialSecurityNum);
	 }
}

class Employee extends Person{
	Employee(String name, int age, String ssn, String add){
		super(name,age,ssn,add);
		
	}
}


public class Main {

	public static void main(String[] args) {
		
		
	Employee e1=new Employee("kusal",30,"xyz","kandy");
	System.out.println(e1.name+" "+e1.age+" "+e1.address);
	e1.display_ssn();
	
	

	}

}
