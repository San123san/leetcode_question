class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(nums, target, 0, 4);
    }
	
    public List<List<Integer>> kSum(int[] nums, long target, int start, int k) {
        List<List<Integer>> ans = new ArrayList<>();

        if (start == nums.length) {
            return ans;
        }
        
        long average_value = target / k;
        
        if  (nums[start] > average_value || average_value > nums[nums.length - 1]) {
            return ans;
        }
        
        if (k == 2) {
            return twoSum(nums, target, start);
        }
    
        for (int i = start; i < nums.length; ++i) {
            if (i == start || nums[i - 1] != nums[i]) {
                for (List<Integer> subset : kSum(nums, target - nums[i], i + 1, k - 1)) {
                    ans.add(new ArrayList<>(Arrays.asList(nums[i])));
                    ans.get(ans.size() - 1).addAll(subset);
                }
            }
        }
    
        return ans;
    }
	
    public List<List<Integer>> twoSum(int[] nums, long target, int start) {
        List<List<Integer>> ans = new ArrayList<>();
        int lo = start, hi = nums.length - 1;
    
        while (lo < hi) {
            int currSum = nums[lo] + nums[hi];
            if (currSum < target || (lo > start && nums[lo] == nums[lo - 1])) {
                ++lo;
            } else if (currSum > target || (hi < nums.length - 1 && nums[hi] == nums[hi + 1])) {
                --hi;
            } else {
                ans.add(Arrays.asList(nums[lo++], nums[hi--]));
            }
        }
                                                          
        return ans;
    }
}