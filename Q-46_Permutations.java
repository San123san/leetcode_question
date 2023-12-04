class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        if(nums.length==1){
            sol.add(Arrays.asList(nums[0]));
            return sol;
        }
        if(nums.length==2){
            sol.add(Arrays.asList(nums[0],nums[1]));
            sol.add(Arrays.asList(nums[1],nums[0]));
            return sol;
        }

        combination(nums,new ArrayList<>(), sol);
        return sol;
    }

    private void combination(int[] nums,List<Integer> path, List<List<Integer>> sol){
        if(path.size() == nums.length){
            sol.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(path.contains(nums[i])) continue;
            path.add(nums[i]);
            combination(nums, path, sol);
            path.remove(path.size() - 1);
        }
    }
}