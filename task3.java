import java.util.Scanner;
class task3{
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);

        System.out.println("What is the number? ");
        int num = input.nextInt();
        input.close();
        int bal1 = num % 3;
        int bal2 = num % 5;
        if (bal1 == 0 && bal2==0){
            System.out.println("divideble by 3 and 5");
        }
        else{
            System.out.println("Not dividable by 3 or 5 or both");
        }
    }
}