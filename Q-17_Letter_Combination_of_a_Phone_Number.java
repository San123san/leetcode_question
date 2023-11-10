class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty())
            return new ArrayList<>();
        
        List<String> ans = new ArrayList<>();
        dfs(digits,0,new StringBuilder(),ans);
        return ans;
    }

    private static final String[] dLetter = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    private void dfs(String digits, int currIndex, StringBuilder currCombination, List<String> result ){
        if(currIndex == digits.length()){
            result.add(currCombination.toString());
            return;
        }

        int currDigits=digits.charAt(currIndex)-'0';
        String lDigit=dLetter[currDigits];

        for(int i=0; i < lDigit.length(); i++){
            char currLetter = lDigit.charAt(i);
            currCombination.append(currLetter);
            dfs(digits,currIndex+1,currCombination,result);
            currCombination.deleteCharAt(currCombination.length()-1);
        }
    }
}