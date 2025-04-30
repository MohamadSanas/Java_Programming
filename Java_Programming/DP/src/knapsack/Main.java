package knapsack;

public class Main {
	
	int knapsack(int[]weight,int[]val,int wt, int n) {
		int [][]dp=new int[n+1][wt+1];
		
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<wt+1;j++) {
				if(i==0||j==0)
					dp[i][j]=0;
				
				else if(weight[i-1]<=j)
					dp[i][j]=Math.max(dp[i-1][j],val[i-1]+dp[i-1][j-weight[i-1]]);
				
				else
					dp[i][j]=dp[i-1][j];
			}
		}
		
		return dp[n][wt];
	}

	public static void main(String[] args) {
		int wt=50;
		int n=3;
		int val []= {60,100,120};
		int weight[]= {10,20,30};
		
		Main obj=new Main();
		
		System.out.println(obj.knapsack(weight,val,wt,n));
		
		

	}

}
