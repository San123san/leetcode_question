class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[]{-1,-1};

        int startpoint=-1,endpoint=-1;

        for(int i=0;i<nums.length;i++){
            if(target==nums[i]) {
                if(startpoint==-1){
                    startpoint=i;
                }
                endpoint=i;
            }
        }
        if(startpoint!=-1){
            return new int[]{startpoint,endpoint};
        }else{
            return new int[]{-1,-1};
        }
    }
}