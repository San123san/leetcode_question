class Solution {
    public int jump(int[] nums) {
        int sol=0;
        int farthest=0;
        int end=0;
        for(int i=0;i<nums.length-1;i++){
            farthest=Math.max(farthest,i+nums[i]);
            if(i==end){
                sol++;
                end=farthest;
            } 
        }
        return sol;
    }
}
