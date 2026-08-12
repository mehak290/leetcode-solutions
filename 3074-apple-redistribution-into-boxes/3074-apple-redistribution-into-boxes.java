class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totalApple=0;
        for( int app: apple){
            totalApple +=app;
        }
        Arrays.sort(capacity);
        int boxes=0;
        for( int i=capacity.length-1;i>=0;i--){
            boxes++;
            totalApple -= capacity[i];
            if(totalApple<=0){
                break;
            }
        }
        return boxes;
    }
}