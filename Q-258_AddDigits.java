class Solution {
    public int addDigits(int num) {
        if(num<10) return num;
        int sumOfdigit=0;
        while(num>9){
            int digit = num%10;
            sumOfdigit += digit;
            num = num/10;
        }
        int tSumOfDigit = sumOfdigit + num;
        if(tSumOfDigit > 9){
            return addDigits(tSumOfDigit);
        }else{
            return tSumOfDigit;
        }
    }
}