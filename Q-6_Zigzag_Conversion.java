class Solution {
    public String convert(String s, int numRows) {
        String ans="";
        if(numRows==1) return s;
        for(int i=0;i<numRows;i++){
            int step = 2*(numRows-1);
            for(int j=i;j<s.length();j+=step){
                ans+=s.charAt(j);
                if(i>0 && i<numRows-1 && j+step-(2*i)<s.length()){
                    ans+=s.charAt(j+step-(2*i));
                }
            }    
        }return ans;
    }
}