class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m][n];

        return dfs(s1, s2, 0, 0, dp);

    }

    private int dfs(String s1, String s2, int i, int j, int[][] dp){
        if(i==s1.length()){
            int sum = 0;
            for (int k=j; k<s2.length(); k++){
                sum += s2.charAt(k);
            }
            return sum;
        }

        if(j==s2.length()){
            int sum=0;
            for(int k=i; k<s1.length(); k++){
                sum += s1.charAt(k);
            }
            return sum;
        }

        if(dp[i][j] != 0){
            return dp[i][j];
        }

        if(s1.charAt(i) == s2.charAt(j)){
            dp[i][j] = dfs(s1, s2, i+1, j+1, dp);
        }else{
            int del_s1 = s1.charAt(i) + dfs(s1, s2, i+1, j, dp);
            int del_s2 = s2.charAt(j) + dfs(s1, s2, i, j+1, dp);
            dp[i][j] = Math.min(del_s1, del_s2);
        }
        return dp[i][j];

    }
}
