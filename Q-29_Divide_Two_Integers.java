class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)){
            return Integer.MAX_VALUE;
        }

        int sign = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0) ? -1 : 1;
        int quo = 0;

        long adividend = Math.abs((long) dividend);
        long adivisor = Math.abs((long) divisor);

        while(adividend >= adivisor){
            int shift = 0;
            while(adividend>= (adivisor<<shift)){
                shift++;
            }
            quo += (1<<(shift - 1));
            adividend -= adivisor<<(shift-1);
        }
        return sign == -1?-quo:quo;
    }
}