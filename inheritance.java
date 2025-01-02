class laptop{
    int charge_per =20;
}

class charge extends laptop{
    
}

public class inheritance{

    public static void main(String[] args){
        charge obj1 = new charge();

        System.out.println(obj1.charge_per);
    }
}