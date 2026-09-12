class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();

        for( char curr : num.toCharArray()){
            while(!st.isEmpty() && k!=0 && curr<st.peek()){
                st.pop();
                k--;
            }
            st.push(curr);
        }
        while(k>0){
            st.pop();
            k--;
        }

        StringBuilder ans= new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans=ans.reverse();

        while(ans.length()>1 && ans.charAt(0)=='0'){
            ans.deleteCharAt(0);
        }
        if(ans.length()==0){
            return "0";
        }
        return ans.toString();
    }
}