class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> output = new ArrayList<String>();
        combination(output,"",0,0,n);
        return output;
    }
    public void combination(List<String> output, String str, int open, int close, int max){
        if(str.length()==max*2){
            output.add(str);
            return;
        }
        if(open<max){
            combination(output,str+"(",open+1,close,max);
        }
        if(close<open){
            combination(output,str+")",open,close+1,max);
        }
    }
}