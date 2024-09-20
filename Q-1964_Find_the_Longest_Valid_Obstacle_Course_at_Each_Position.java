class Solution {
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        int n = obstacles.length;
        int[] ans = new int[n];
        List<Integer> store = new ArrayList<>();

        for(int i=0; i<n; i++){
            int obstacle = obstacles[i];
            int pos = binarySearch(store, obstacle);

            if(pos<0){
                pos = -(pos + 1);
            }

            if (pos < store.size()) {
                store.set(pos, obstacle);
            } else {
                store.add(obstacle);
            }
            ans[i] = pos+1;
        }

        return ans;

    }

     public int binarySearch(List<Integer> dp, int obstacle) {
        int left = 0, right = dp.size();
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (dp.get(mid) <= obstacle) {
                left = mid + 1;
            } else {
                right = mid; 
            }
        }
        return left; 
    }
}
