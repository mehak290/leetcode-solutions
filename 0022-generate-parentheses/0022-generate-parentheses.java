class Solution {
    List<String> res = new ArrayList();
    StringBuilder curr = new StringBuilder();
    public List<String> generateParenthesis(int n) {
        GP(0,0,n);
        return res;
    }
    private void GP(int open , int close, int n){
        if(curr.length() == 2*n){
        res.add(curr.toString());
        return;
        }
        if(open<n){
            curr.append("(");
            GP(open+1,close,n);
            curr.deleteCharAt(curr.length()-1);
        }
        if(close<open){
            curr.append(")");
            GP(open,close+1,n);
            curr.deleteCharAt(curr.length()-1);
        }
}
}