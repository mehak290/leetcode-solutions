class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0;
        int total=nums1.length + nums2.length;
        int prev=0, curr=0;
        for( int count=0; count<=total/2;count++){
            prev=curr;
            if(i<nums1.length && (j>=nums2.length || nums1[i]<=nums2[j])){
                curr=nums1[i];
                i++;
            }
            else{
                curr=nums2[j];
                j++;
            }
        }
        if(total%2==1) return curr;
        return (curr+prev)/2.0;
    }
}