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
    public List<String> binaryTreePaths(TreeNode root) {
       List<String> res = new ArrayList<>();
       if(root==null) return res;
       if(root.left==null && root.right == null){
        res.add("" + root.val);
        return res;
       } 
       List<String> left = binaryTreePaths(root.left);
       List<String> right = binaryTreePaths(root.right);
       for(String str: left){
        res.add(root.val+"->"+str);
       }
       for(String str:right){
        res.add(root.val+"->"+str);
       }
       return res;
    }
}