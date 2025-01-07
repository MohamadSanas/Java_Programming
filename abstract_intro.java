abstract class Vehicle{
    abstract void speed();

    void brand(){
        System.out.println("hi");
    }
}

class Car extends Vehicle{
    void speed(){
        System.out.println("abstract method access from child class");

    }
}

class Bike {
    void speed(){

    }

    void check(){
        System.out.println("check method from bike child class");
    }

    
}


public class abstract_intro{
    public static void main(String[] args){
        Bike obj_bike=new Bike();
        obj_bike.check();

        Car obj_car=new Car();
        obj_car.speed();
    }
}