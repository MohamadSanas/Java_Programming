package package_01;

import package_02.Teacher_02;

public class Student extends Teacher_02 {

	public static void main(String[] args) {
		
		System.out.println("hello");
		
		Teacher obj1=new Teacher();
		obj1.display();
		
		Teacher_02 obj2=new Teacher_02();
		System.out.println(obj2.Name);
		
		obj2.display();
		
		Student s1=new Student();
		System.out.println(s1.salary);
	}

}
