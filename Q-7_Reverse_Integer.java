class Solution {
    public int reverse(int x) {
        
        long total=0;

        while(x!=0){
            int digit = x%10;
            total = total*10+digit;
            if(total<Integer.MIN_VALUE ||total>Integer.MAX_VALUE) return 0;
            x/=10;
        }
        return (int)total;
    }
}