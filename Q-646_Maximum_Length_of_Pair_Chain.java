class Solution {
    public int findLongestChain(int[][] pairs) {

         Arrays.sort(pairs, Comparator.comparingInt(row -> row[0])); //sort

         int n = pairs.length;
         int[] dp = new int[n];
         Arrays.fill(dp, -1);

         int maxLength = 0;

         for(int i=0; i<n; i++){
            maxLength = Math.max(maxLength, dfs(pairs, i, dp));
         }

         return maxLength;

    }

    private static int dfs(int[][] pairs, int index, int[] dp){
        if(dp[index] != -1){
            return dp[index];
        }

        int maxLength = 1;

        for(int i=index+1; i<pairs.length; i++){
            if(pairs[i][0]>pairs[index][1]){
                maxLength = Math.max(maxLength, 1 + dfs(pairs, i, dp));
            }
        }

        dp[index] = maxLength;
        return maxLength;


    }

}
