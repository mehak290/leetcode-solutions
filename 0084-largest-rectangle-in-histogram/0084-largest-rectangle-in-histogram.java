class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack <Integer> st = new Stack<>();
        int ans=0;
        for( int i=0;i<=heights.length;i++){
            int curr=(i==heights.length)?0:heights[i];
            while(!st.isEmpty() && curr<heights[st.peek()]){
                int h=heights[st.pop()];
                int width=st.isEmpty()?i:i-st.peek()-1;
                ans=Math.max(ans, h*width);
            }
            st.push(i);
        }
        return ans;
    }
}