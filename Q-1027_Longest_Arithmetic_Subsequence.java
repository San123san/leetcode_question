class Solution {
    public int longestArithSeqLength(int[] nums) {
       int n = nums.length;
       if(n<2) return n;

       Map<Integer, Integer>[] dp = new Map[n];
       for(int i=0; i<n; i++){
        dp[i] = new HashMap<>();
       }

       int maxLength = 0;

       for(int i=1; i<n; i++){
        for(int j=0; j<i; j++){
            int diff = nums[i] - nums[j];

            int length = dp[j].getOrDefault(diff,1)+1;

            dp[i].put(diff, length);

            maxLength = Math.max(maxLength, length);
        }
       }
       return maxLength;
    }
}
