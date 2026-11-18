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
// class Solution {
//     public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
// List<List<Integer>> res = new ArrayList<>();
//         if(root==null) return res;
//         Queue<TreeNode> q = new LinkedList<>();
//         q.add(root);
//         Boolean flag = true;
//         while(!q.isEmpty()){
//             int size= q.size();
//             List<Integer> level = new ArrayList<>();
//             for(int i=0;i<size;i++){
//                 TreeNode curr = q.poll();
//                 if(flag){
//                     level.add(curr.val);
//                 }
//                 else {
//                     level.add(0,curr.val);
//                 }
//                 if(curr.left!=null){
//                     q.offer(curr.left);
//                 }
//                 if(curr.right!=null){
//                     q.offer(curr.right);
//                 }
//             }
//             res.add(level);
//             flag=!flag;
//         }
//         return res;
//     }
// }



class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Stack<TreeNode> st1 = new Stack();
        Stack<TreeNode> st2 = new Stack();
        if(root == null) return res;
        st1.push(root);
        while(!st1.isEmpty() ||  !st2.isEmpty()){
            List<Integer> level = new ArrayList<>();
            while(!st1.isEmpty()){
                TreeNode curr = st1.pop();
                level.add(curr.val);
                if(curr.left!=null){
                    st2.push(curr.left);
                }
                if(curr.right!=null){
                    st2.push(curr.right);
                }
            }
            if(!level.isEmpty()){
                res.add(level);
            }
            level = new ArrayList<>();

             while(!st2.isEmpty()){
                TreeNode curr = st2.pop();
                level.add(curr.val);
                if(curr.right!=null){
                    st1.push(curr.right);
                }
                if(curr.left!=null){
                    st1.push(curr.left);
                }
            }
              if(!level.isEmpty()) {
                res.add(level);
            }
        }
        return res;
    }
}