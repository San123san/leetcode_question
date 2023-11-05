class Solution {
    public int myAtoi(String s) {
        int ans=0;
        int sign_digit = 1;
        int i=0;

        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }

        if(i<s.length() && (s.charAt(i)=='-' || s.charAt(i)=='+')){
            sign_digit=(s.charAt(i)=='-')?-1:1;
            i++;
        }

        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';

            if(ans>(Integer.MAX_VALUE - digit)/10){
                return (sign_digit == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans = ans * 10 + digit;
            i++;
        }
        return ans*sign_digit;
    }
}