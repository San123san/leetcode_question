class Solution {
    public int deleteAndEarn(int[] nums) {
        HashMap<Integer, Integer> store = new HashMap<>();
        for(int num: nums){
            store.put(num, store.getOrDefault(num,0)+1);
        }

        HashMap<Integer, Integer> dp = new HashMap<>();
        int maxNum = 0;

        for(int num: store.keySet()){
            if(num>maxNum){
                maxNum = num;
            }
        }

        dp.put(0,0);
        dp.put(1, store.getOrDefault(1,0)*1);

        for(int i=2; i <= maxNum; i++){
            int earn = i*store.getOrDefault(i,0);
            int maxPoint = Math.max(dp.getOrDefault(i-1,0), dp.getOrDefault(i-2,0)+earn);
            dp.put(i, maxPoint);
        }

        return dp.get(maxNum);
    }
}
