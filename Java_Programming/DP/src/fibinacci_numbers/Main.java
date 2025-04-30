package fibinacci_numbers;

import java.util.Arrays;

public class Main {
	
	int fibRec(int arr[],int count){
		
		if(count<=1) {
			return count;
		}
		
		
		if(arr[count]!=-1) {
			return arr[count];
		}
		
		arr[count]=fibRec(arr,count-1)+ fibRec(arr,count-2);
		return arr[count];
		
		
	}
	
																
	
	int fib(int count) {
		
		int[] arr=new int[count+1];
		Arrays.fill(arr,-1);
		
		return fibRec(arr,count); 
		
	}

	public static void main(String[] args) {
		int count=5;
		
		Main obj=new Main();
		System.out.println(obj.fib(count));
	}

}
