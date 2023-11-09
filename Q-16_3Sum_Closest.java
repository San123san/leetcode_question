class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest = Integer.MAX_VALUE;
        int mindif = Integer.MAX_VALUE;

        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
            int l=i+1;
            int r=nums.length-1;

            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                int diff = Math.abs(sum-target);
                
                if(diff<mindif){
                    mindif = diff;
                    closest = sum;
                }

                if(sum<target){
                    l++;
                }else if(sum>target){
                    r--;
                }else{
                    return closest;
                }
            }
        }
        return closest;
    }
}