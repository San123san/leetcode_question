class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      List<List<Integer>> sol = new ArrayList<>();
      Arrays.sort(candidates);
      findcombine(candidates,0,target,new ArrayList<>(),sol);
      return sol;  
    }
    private void findcombine(int[] candidates,int index,int target,List<Integer> current, List<List<Integer>> sol){
        if(target==0){
            sol.add(new ArrayList<>(current));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i==index||candidates[i]!=candidates[i-1]){
                current.add(candidates[i]);
                findcombine(candidates,i+1,target-candidates[i],current,sol);
                current.remove(current.size()-1);
            }
        }
    }
}