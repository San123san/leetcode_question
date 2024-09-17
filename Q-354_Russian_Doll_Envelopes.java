class Solution {

    public int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length;
       Arrays.sort(envelopes, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(b[1], a[1]);
            }
        });

        int[] heights = new int[n];
        for(int i=0; i<n; i++){
            heights[i] = envelopes[i][1];
        }
// with the help of binarry search 
        return lengthOfEnvelopes(heights);
    }

    public int lengthOfEnvelopes(int[] heights){
        List<Integer> store = new ArrayList<>();

        for(int height: heights){
            int left=0, right=store.size();
            while(left<right){
                int mid = left+(right-left)/2;
                if(store.get(mid)<height){
                    left = mid+1;
                }else{
                    right=mid;
                }
            }
            if(left == store.size()){
                store.add(height);
            }else{
                store.set(left, height);
            }
        }
        return store.size();
    }
}
