class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> sol = new ArrayList<>();
        HashMap<String,List<String>> word = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String temp = strs[i];
            char[] cha = temp.toCharArray();
            Arrays.sort(cha);
            if(word.containsKey(String.valueOf(cha))){
                word.get(String.valueOf(cha)).add(strs[i]);
            }else{
                List<String> all = new ArrayList<>();
                all.add(strs[i]);
                word.put(String.valueOf(cha),all);
            }
        }
        for(List<String> item: word.values()){
            sol.add(item);
        }
        return sol;
    }
}