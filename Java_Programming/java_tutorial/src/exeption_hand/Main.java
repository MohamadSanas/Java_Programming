package exeption_hand;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	try {
		int a= input.nextInt();
		System.out.println(a);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	input.close();

	}

}
