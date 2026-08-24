class Solution {
    boolean dfs(char[][]c , String w, int i, int j, int k){
        if(i<0 || i>=c.length || j<0 || j>=c[0].length || c[i][j]!=w.charAt(k)) return false;
        if(k==w.length()-1) return true;
        char t=c[i][j];
        c[i][j]='#';
        boolean ans=dfs(c,w,i+1,j,k+1)||dfs(c,w,i-1,j,k+1)||dfs(c,w,i,j+1,k+1) ||dfs(c,w,i,j-1,k+1);
        c[i][j]=t;
        return ans;
    }
    public boolean exist(char[][] board, String word) {
        for( int i=0;i<board.length;i++){
            for( int j=0;j<board[0].length;j++){
                if(dfs(board,word,i,j,0)) return true;
            }
        }
        return false;
    }
}