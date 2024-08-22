class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if(n==1) return 0;
        if(n==2) return Math.min(cost[0],cost[1]);
        int[] dp = new int[n];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2; i<cost.length; i++){
            dp[i] = Math.min(dp[i-1],dp[i-2]) + cost[i];
        }
        return Math.min(dp[n-1],dp[n-2]);
    }
}
