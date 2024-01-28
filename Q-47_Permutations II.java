class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        if(nums.length==1) {
           sol.add(Arrays.asList(nums[0]));
           return sol; 
        }
        if(nums.length==2 && nums[0]==nums[1]){
            sol.add(Arrays.asList(nums[0],nums[1]));
            return sol;
        }
        if(nums.length==2) {
            sol.add(Arrays.asList(nums[0],nums[1]));
            sol.add(Arrays.asList(nums[1],nums[0]));
            return sol;
        }
        Arrays.sort(nums);
        combine(nums, new ArrayList<>(),sol,new boolean[nums.length]);
        return sol;
    }
    private void combine(int[] nums, List<Integer> path, List<List<Integer>> sol, boolean[] use){
        if(nums.length==path.size()){
            sol.add(new ArrayList<>(path));
            return;
        }
        for(int i=0; i<nums.length;i++){
            if(use[i] || i>0 && nums[i]==nums[i-1] && !use[i-1]) continue;
            path.add(nums[i]);
            use[i]=true;
            combine(nums,path,sol,use);
            path.remove(path.size()-1);
            use[i]=false;
        }
    }
}