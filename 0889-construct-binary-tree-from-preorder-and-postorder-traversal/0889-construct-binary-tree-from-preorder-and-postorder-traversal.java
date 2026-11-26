/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        TreeNode root = new TreeNode(preorder[0]);
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        int j=0;
        for( int i=1;i<preorder.length;i++){
            TreeNode node = new TreeNode(preorder[i]);
            while(!st.isEmpty() && st.peek().val == postorder[j]){
                st.pop();
                j++;
            }
            if(st.peek().left==null) st.peek().left =node;
            else st.peek().right =node;
            st.push(node);
        }
        return root;
        
    }
}