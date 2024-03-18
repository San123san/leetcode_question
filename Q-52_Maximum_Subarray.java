class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
       if(len==0) return 0;
       return subarray(len, nums);
    }
    public int subarray(int len,int[] nums){
        int add = nums[0];
        int temp =nums[0];
        for(int i = 1;i<len;i++){
            if(nums[i] + add> nums[i]){
                add = nums[i]+add;
            }else{
                add=nums[i];
            }
            
            if(add>temp){
                temp=add;
            }
        }
        return temp;
    }
}