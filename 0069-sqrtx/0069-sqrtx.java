class Solution {
    public int mySqrt(int x) {
        int left=0;
        int right=x;
        int mid =0;
        while(left<=right){
            mid=left+(right-left)/2;
            if((long)mid*mid==x) return mid;
            else if((long)mid*mid>x) right=mid-1;
            else{
                left=mid+1;
            }
        }
        return right;
    }
}