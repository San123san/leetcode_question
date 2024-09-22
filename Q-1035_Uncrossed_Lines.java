class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[][] dp = new int[m][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return recc(0, 0, nums1, nums2, dp);
    }

    public int recc(int i, int j, int[] nums1, int[] nums2, int[][] dp){
        if(i>=nums1.length || j>=nums2.length) return 0;

        if(dp[i][j] != -1) return dp[i][j];

        if(nums1[i] == nums2[j]) return dp[i][j] = 1 + recc(i+1, j+1, nums1, nums2, dp);

        return dp[i][j] = Math.max(recc(i, j+1, nums1, nums2, dp),recc(i+1, j, nums1, nums2, dp));

    }
}
