class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        int[][] dp = new int[row][col];

        for(int j=0; j<row; j++){
            dp[0][j] = matrix[0][j];
        }

        for(int i=1; i<row; i++){
            for(int j=0; j<col; j++){
                int minAbove = dp[i-1][j];

                if(j>0){
                    minAbove = Math.min(minAbove, dp[i-1][j-1]);
                }
                if(j<col-1){
                    minAbove = Math.min(minAbove, dp[i-1][j+1]);
                }
                
                dp[i][j] = matrix[i][j] + minAbove;
            }
        }

        int minSum = dp[row-1][0];
        for(int j=1; j<col; j++){
            minSum = Math.min(minSum, dp[row-1][j]);
        }

        return minSum;
    }
}
