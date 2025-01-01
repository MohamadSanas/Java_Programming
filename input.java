import java.util.Scanner;

class input{
    public static void
    main(String[] args){
        Scanner input =new Scanner(System.in);

        System.out.println("Enter a number: ");
        int data = input.nextInt();
        System.out.println("Data is "+data);
        
        System.out.println("Enter a double number ");
        double data2 =input.nextDouble();
        System.out.println("Number is "+data2);

        input.nextLine();
        System.out.println("give a sentence ");
        String data3=input.nextLine();
        System.out.println("Sentence is = "+data3);

        input.close();
    }
}