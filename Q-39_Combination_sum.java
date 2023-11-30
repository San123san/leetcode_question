class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> sol = new ArrayList<>();
        Arrays.sort(candidates);
        rec(0,candidates,target,new ArrayList<>(),sol);
        return sol;
    }
    private void rec(int s, int[] candidates, int target, List<Integer> num, List<List<Integer>>sol){
        if(target<0) return;
        if(target==0){
            sol.add(new ArrayList<>(num));
            return;
        }
        for(int i=s;i<candidates.length;i++){
            num.add(candidates[i]);
            rec(i,candidates,target-candidates[i],num,sol);
            num.remove(num.size()-1);
        }
    }
}