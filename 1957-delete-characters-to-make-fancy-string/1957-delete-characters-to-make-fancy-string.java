class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int n=ans.length();
            if(n>=2 && ans.charAt(n-1)==ch && ans.charAt(n-2)==ch){
                continue;
            }
            ans.append(ch);
        }
        return ans.toString();
    }
}