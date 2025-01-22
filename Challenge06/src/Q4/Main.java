package Q4;

abstract class Animal{
	
	String Name;
	
	Animal(String Name){
		this.Name=Name;
		System.out.println("name of the animal is "+Name);
	}
	
	abstract void makeSound();
	
}

class Dog extends Animal {
	
	Dog(String Name){
		super(Name);
	}
	void makeSound(){
		System.out.println("Dog is barking");
	}
}

class Cat extends Animal{
	
	Cat(String Name){
		super(Name);
	}
	
	void makeSound() { 
		System.out.println("Cat meow");
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		Dog d1 = new Dog("Dog manaseer");
		d1.makeSound();
		
		Cat c1 = new Cat("Cat manaseer");
		c1.makeSound();
		

	}

}
