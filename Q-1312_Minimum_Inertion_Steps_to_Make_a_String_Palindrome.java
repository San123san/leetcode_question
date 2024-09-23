class Solution {
    public int minInsertions(String s) {
        int m = s.length();
        int[][] dp = new int[5001][5001]; 

        int maxLength = 0;
        
        maxLength = Math.max(maxLength, recc(0, m-1, dp, s));
        
        return maxLength;
    }

    public int recc(int i, int j, int[][] dp, String s){
        if(i >= j) return 0;
        if(dp[i][j] != 0) return dp[i][j];

        if(s.charAt(i) == s.charAt(j)) return dp[i][j] = recc(i+1, j-1, dp, s);

        return dp[i][j] = Math.min(1+recc(i, j-1, dp, s), 1+recc(i+1, j, dp, s));
    }
}
