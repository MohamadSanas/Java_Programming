package Q5;

abstract class Vehicale{
	final void startEngine() {
		System.out.println("Engine started");
	}
	
	static String getVehicaleType() {
		return "buy";
	}
	
	abstract void drive();
	
}

class Car extends Vehicale{
	void drive(){
		System.out.println("drive a car ");
	}
	
}

class Motorcyle extends Vehicale{
	void drive() {
		System.out.println("drive ");
	}
	
}


public class Main {

	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.drive();
		System.out.println(Vehicale.getVehicaleType());
		
		

	}

}
