package binomial_coefficients;

import java.util.Arrays;

public class Main {
	
	int cal(int arr[][],int n,int r) {
		if(r==n||r==0)
			return 1;
		
		if(arr[n][r]!=-1) {
			return arr[n][r];
		}
		
		arr[n][r]=cal(arr,n-1,r)+cal(arr,n-1,r-1);
		
		
		
		return arr[n][r];
		
	}
	
	int coff(int n,int r){
		int[][] arr=new int[n+1][n];
		
		for(int[] row:arr)
			Arrays.fill(row, -1);
		
		return cal(arr,n,r);
		
		
		
	}

	public static void main(String[] args) {
		int n=5, r=3;
		
		
		Main obj=new Main();
		System.out.println(obj.coff(n,r));
		

	}

}
