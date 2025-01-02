public class this_keyword{

    String myname=null;
    String myname2=null;

    this_keyword(){
        System.out.println("Hello");
    }

    void setName(String myname){
        this.myname=myname;
    }

    void setName2(String myname2){
        myname2=myname2;
    }
    public static void main(String[] args){
        this_keyword obj1=new this_keyword();

        obj1.setName("sanas");
        System.out.println(obj1.myname);
        obj1.setName2("sanas_2");
        System.out.println(obj1.myname2);
    }
}