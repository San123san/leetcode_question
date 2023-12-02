class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }
        char[] cha1 = num1.toCharArray();
        char[] cha2 = num2.toCharArray();
        int len1 = num1.length(), len2 = num2.length();
        int[] res = new int[len1+len2];
        for(int i = len2 - 1; i >= 0; i--){
            for(int j = len1 -1; j >= 0; j--){
                int pro = (cha1[j] - '0') * (cha2[i] - '0');
                int curr = pro + res[i+j+1];
                res[i+j+1] = curr%10;
                res[i+j] += curr/10; 
            }
        }
        int idx = 0;
        while(idx<res.length && res[idx]==0){
            ++idx;
        }

        String result="";
        for(int i=idx;idx<res.length;idx++){
            result += String.valueOf(res[idx]);
        }
        return result;
    }
}