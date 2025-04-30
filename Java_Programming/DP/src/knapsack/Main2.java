package knapsack;

class Main2 {
    static int knapSack(int W, int weight[], int val[], int n) {
        int dp[][] = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                } 
                else if (weight[i - 1] <= w) {  
                    dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - weight[i - 1]], dp[i - 1][w]);
                } 
                else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][W];
    }

    public static void main(String args[]) {
        int profit[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W = 60;
        int n = profit.length;

        System.out.println("Maximum value in knapsack = " + knapSack(W, weight, profit, n));
    }
}

