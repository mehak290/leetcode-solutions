class Solution {
        List<List<Integer>> res =  new ArrayList();
        List<Integer> temp = new ArrayList();
        public List<List<Integer>> subsetsWithDup(int[] nums) {
             Arrays.sort(nums);
             generatesubset(0,nums);
             return res;
    }
        public void generatesubset(int ind, int[] arr){
            res.add(new ArrayList<>(temp));
            for( int i = ind; i<arr.length; i++){
                if(i!= ind  && arr[i] == arr[i-1]){
                    continue;
                }
                temp.add(arr[i]);
                generatesubset(i+1,arr);
                temp.remove(temp.size()-1);
            }

        }
}