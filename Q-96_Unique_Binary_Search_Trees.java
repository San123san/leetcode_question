class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        int result = 0;

        Arrays.fill(dp, -1);
        return solve(n, dp);
    }

    public int solve(int n, int[] dp){
        if(dp[n] != -1) return dp[n];

        if(n<=1) return 1;

        int result = 0;

        for(int i=1; i<=n; i++){
            result += solve(i - 1, dp) * solve(n - i, dp);
        }

        dp[n] = result;

        return result;

    }
}
