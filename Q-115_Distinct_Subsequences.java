class Solution {
    public int numDistinct(String s, String t) {
       int m = s.length();
       int n = t.length();

       int[][] dp = new int[m+1][n+1];
       for(int[] row:dp){
        Arrays.fill(row,-1);
       } 
       return dfs(s, t, m, n, dp);
    }

    private int dfs(String s, String t, int i, int j, int[][] dp){
        if(j==0){
            return 1;
        }
        if(i==0){
            return 0;
        }

        if (dp[i][j] != -1) return dp[i][j];
        
        if(s.charAt(i-1) == t.charAt(j-1)){
            dp[i][j] = dfs(s, t, i-1, j-1, dp) + dfs(s, t, i-1, j, dp);
        }else{
            dp[i][j] = dfs(s, t, i-1, j, dp);
        }

        return dp[i][j];

    }
}
