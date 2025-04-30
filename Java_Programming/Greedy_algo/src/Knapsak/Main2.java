package Knapsak;

class Main2 {
    static int knapSack(int W, int weight[], int val[], int n) {
        if (n == 0 || W == 0)
            return 0;

        if (weight[n - 1] > W)
            return knapSack(W, weight, val, n - 1);

        return Math.max(knapSack(W, weight, val, n - 1), val[n - 1] + knapSack(W - weight[n - 1], weight, val, n - 1));
    }

    public static void main(String args[]) {
        int profit[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int W = 50;
        int n = profit.length;
        System.out.println(knapSack(W, weight, profit, n));
    }
}
