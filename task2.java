import java.util.Scanner;
class task2{
    public static void main(String args[]){
        System.out.println("Win or Loose? ");
        Scanner input = new Scanner(System.in);

        String result = input.nextLine();

        input.close();

        if(result.equals("Win")||result.equals("win")){
            System.out.println("our cup");
        }
        else if(result.equals("Loose")|| result.equals("loose")){
            System.out.println("next time");
        }
        else{
            System.out.println("did not understood");
        }
    }
}