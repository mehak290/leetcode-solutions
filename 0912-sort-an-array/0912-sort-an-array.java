class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        for(int i=n/2-1;i>=0;i--){
            Heapify(nums,n,i);
        }
        
        for( int i=n-1;i>0;i--){
            int t=nums[i];
            nums[i]=nums[0];
            nums[0]=t;
            Heapify(nums,i,0);
        }
        return nums;
    }
    private void Heapify(int[] nums, int n , int i){
        int largest = i;
        int left= 2*i+1;
        int right = 2*i+2;
        if(left<n && nums[left]> nums[largest])
            largest=left;
        if(right<n && nums[right]>nums[largest])
            largest=right;
        if(i!=largest){
            int temp=nums[i];
            nums[i]=nums[largest];
            nums[largest]=temp;
            Heapify(nums, n, largest);
        }
    }

}