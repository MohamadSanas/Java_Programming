package throws_exp;

import java.util.Scanner;




public class Main {
	
	public static double div(int num)throws Exception {
		return 50/num;
	}
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter the num to divide 50");
		
		try {
		int num=input.nextInt();
		try {
			double aswr=div(num);
			System.out.println(aswr);
			}
			
			catch(Exception e){
				System.out.println(e);
				
			}
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
