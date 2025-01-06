class Person{
    String name;
    Person (String name){
        this.name=name;
        System.out.println(name);
    }

}

class Employee extends Person{

    Employee(String name1){
        super(name1);
    }

    void detail(){

    }
}



public class super_keyword{
    public static void main(String[] args){
        Employee obj1=new Employee("kasun");
    }
}