// class Solution {
//     public List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>> result = new ArrayList<>();
//         backtrack(nums, new ArrayList<>(), result);
//         return result;
//     }
//     private void backtrack(int[] nums, List<Integer> current, List<List<Integer>> result) {
//         if (current.size() == nums.length) {
//             result.add(new ArrayList<>(current));
//             return;
//         }
//         for (int i = 0; i < nums.length; i++) {
//             if (current.contains(nums[i])) {
//                 continue;
//             }
//             current.add(nums[i]);
//             backtrack(nums, current, result);
//             current.remove(current.size() - 1);
//         }
//     }
// }

class Solution{
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    boolean[] used;
    public List<List<Integer>> permute(int[] nums){
        used =  new boolean[nums.length];
        backtrack(nums);
        return ans;
    }
    public void backtrack(int [] nums){
        if(temp.size() ==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
    for(int i=0;i< nums.length;i++){
        if(used[i]) continue;
        used[i]=true;
        temp.add(nums[i]);
        backtrack(nums); //recursion
        temp.remove(temp.size()-1);
        used[i]=false;
    }
    }
}