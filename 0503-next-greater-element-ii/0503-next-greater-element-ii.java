class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr= new int[nums.length*2];
        for( int i=0;i<nums.length*2;i++){
            arr[i]=nums[i%nums.length];
        }
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=-1;
            for( int j=i+1;j<arr.length;j++){
            if(nums[i]<arr[j]) {
                ans[i]=arr[j];
            break;
            }
        }
    }
        return ans;
    }
}