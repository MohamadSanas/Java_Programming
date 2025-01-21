package package_One;

import package_Two.Teacher02;
import package_Two.Teacher03;



public class Student extends Teacher03  {
	public static void main(String[] args) {
	Teacher obj = new Teacher();
	
	System.out.println(obj.salary);
	/*System.out.println(obj.age);
	this could be wrong because can not access private
	element from other class even its in same package*/
	obj.getage();
	
	
	Teacher02 obj02 = new Teacher02();
	System.out.println(obj02.salary2);
	
	Student std1 =new Student();
	System.out.println(std1.check);
	
	
	}
}
 