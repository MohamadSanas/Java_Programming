
class Animal{
    String name;
    int age;

    void makesound(){
        System.out.println("Animal makes  a sound");
    }
}

class Dog extends Animal{
    String breed;

    void fetch(){
        System.out.println("Dog is fetching");
    }

    void makesound(){
        System.out.println("Dog barks");
    }

}

class Cat extends Animal{
    String color;

    void makesound(){
        System.out.println("Cat meows");
    }

    void climb(){
        System.out.println("Cat is Climbing");
    }
}



public class inheritance_type{

    public static void main(String[] args){

        Animal obj1= new Animal();
        obj1.name="Hourse";
        obj1.age=15;

        System.out.println("name (access from Animal class): "+obj1.name);
        System.out.println("age (access from Animal class): "+obj1.age);
        System.out.print("sound (access from Animal class): ");
        obj1.makesound();

        Dog obj2 = new Dog();
        obj2.name="dog2";
        obj2.age=12;
        obj2.breed="by kusal";

        System.out.println("name (access from Dog class): "+obj2.name);
        System.out.println("age (access from Dog class): "+obj2.age);
        System.out.println("breed (access from Dog class): "+obj2.breed);
        System.out.print("sound (access from Dog class): ");
        obj2.makesound();
        System.out.print("Special (access from Dog class): ");
        obj2.fetch();


        Cat obj3 = new Cat();
        obj3.name="cat2";
        obj3.age=13;
        obj3.color="black";

        System.out.println("name (access from Cat class): "+obj3.name);
        System.out.println("age (access from Cat class): "+obj3.age);
        System.out.println("colour (access from Cat class): "+obj3.color);
        System.out.print("sound (access from Cat class): ");
        obj3.makesound();
        System.out.print("Special (access from Cat class): ");
        obj3.climb();



    }

}