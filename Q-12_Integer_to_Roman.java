class Solution {
    public String intToRoman(int num) {
        String roman[]={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int value[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};

        int rsize=roman.length;
        String ans="";
        
        for(int i=value.length-1;i>=0;i--){
            while(num>=value[i]){
                ans+=roman[i];
                num-=value[i];
            }
        }
        return ans;
    }
}