class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        if(n<=1) return 1;

        Map<String, Integer> store = new HashMap<>();

        int maxLength = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int difference = nums[j] - nums[i];
                maxLength = Math.max(maxLength, 1 + recc(nums, j, n, difference, store));
            }
        }
        return maxLength;
    }

    public static int recc(int[] nums, int idx, int n, int difference, Map<String, Integer> store){
        if(idx>=n) return 0;

        String key = idx + "," + difference;

        if(store.containsKey(key)){
            return store.get(key);
        }

        int length = 1;

        for(int k=idx+1; k<n; k++){
            if(nums[k]-nums[idx] == difference){
            length = Math.max(length, 1+ recc(nums, k, n, difference, store));
          }
        }

        store.put(key, length);

        return length;

    }
}
