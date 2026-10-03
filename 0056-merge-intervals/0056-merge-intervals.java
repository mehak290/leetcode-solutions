class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        List<int[]> ans = new ArrayList();
        for( int [] curr : intervals){
            if(ans.isEmpty()) ans.add(curr);
            else{
                int [] last = ans.get(ans.size()-1);
                if(last[1] >= curr[0]){
                    last[1]= Math.max(last[1],curr[1]);
                }
                else{
                    ans.add(curr);
                }
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}