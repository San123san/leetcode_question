class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for(int i=1;i<n;i++){
            s=count(s);
        }
        return s;
    }

    public String count(String s){
        int c = 1;
        char cha = s.charAt(0);
        StringBuilder curr = new StringBuilder();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==cha){
                c++;
            }else{
                curr.append(c);
                curr.append(cha);
                cha = s.charAt(i);
                c = 1;
            }
        }
        curr.append(c);
        curr.append(cha);
        return curr.toString();
    }
}