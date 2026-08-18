class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (x,y)->x[0]-y[0]);
        List<int[]> ans= new ArrayList<>();
        for(int[] x:intervals){
            if(ans.isEmpty() || ans.get(ans.size()-1)[1] < x[0]) ans.add(x);
            else ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1],x[1]);
        }
        return ans.toArray(new int[0][]);
    }
}