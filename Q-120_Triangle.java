class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int col = triangle.length;
        int row = triangle[0].length;

        if (col == 1 && row == 1) return col[0];

        int[] dp = new int();

        dp[0] = col[0];
        int count=0;
        for(int i=1; i<col; col++){
            for(int j=1; j<row; row++){
                int count1;
                dp[i]=Math.min(triangle[i],triangle[i-1]);
                count1=dp[i];
            }
            count= count+count1;
        }
        return count;
    }
}
