import java.util.Scanner;

class task1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name =input.nextLine();

        System.out.println("What is your score? ");
        Double score = input.nextDouble();
        input.nextLine();

        System.out.println("What is your department?");
        String dept = input.nextLine();

        System.out.println("My name is "+ name+"\nMy Score is "+score/10+"\nMy Department is "+ dept);

        input.close();
    }
}