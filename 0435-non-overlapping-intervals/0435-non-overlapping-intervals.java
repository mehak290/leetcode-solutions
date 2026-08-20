class Solution {
    public int eraseOverlapIntervals(int[][] interval) {
        Arrays.sort(interval, (a,b)->a[1]-b[1]);
        int count=0;
        int end=interval[0][1];
        for( int[] num: interval){
            if(num[0]<end) count++;
            else end=num[1];
        }
        return count-1;
    }
}