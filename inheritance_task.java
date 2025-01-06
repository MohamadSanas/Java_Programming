class Vehicle{
    String name;
    int year;

    void startEngine(){
    }
}

class Car extends Vehicle{
    String fuel_type;

    void startEngine(){
        System.out.println("Car Engine Starts.");
    }

    void derive(){
        System.out.println("Car is driving.");
    }

}

class Truck extends Vehicle{
    int loadCapacity;
    void startEngine(){
        System.out.println("Truck Engine starts.");
    }

    void haul(){
        System.out.println("Truck is hauling");
    }
}



public class inheritance_task{
    public static void main(String[] args){

        Vehicle obj1 = new Vehicle();
        obj1.startEngine();
        obj1.name="newVehicle";
        System.out.println(obj1.name);


        Truck obj2 = new Truck();
        obj2.loadCapacity=200;
        obj2.name="newTruck";
        System.out.println(obj2.name);
        obj2.startEngine();


    }
}