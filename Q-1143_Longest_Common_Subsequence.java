class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return recc(0, 0, text1, text2, dp);
    }

    public int recc(int i, int j, String text1, String text2, int[][] dp){
        if(i>=text1.length() || j>=text2.length()) return 0;

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(text1.charAt(i) == text2.charAt(j)) return dp[i][j] = 1 + recc(i+1, j+1, text1, text2, dp);

        return dp[i][j] = Math.max(recc(i, j+1, text1, text2, dp), recc(i+1, j, text1, text2, dp));
    }
}
