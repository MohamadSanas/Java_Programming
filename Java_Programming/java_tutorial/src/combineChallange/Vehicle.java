package combineChallange;

abstract public class Vehicle {
	final void startEngine() {
		System.out.println("Engin started");
	}
	
	public static String getVehicleType(String type) {
		//System.out.print("type of the vehicle");
		return type;
	}
	
	abstract void drive();

}
