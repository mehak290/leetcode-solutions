class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] res= new String[n];
        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->b[0]-a[0]);
        for( int i = 0;i<n;i++){
            pq.offer(new int[]{score[i],i});
        }
        int rank=1;
        while(!pq.isEmpty()){
            int [] curr = pq.poll();
            int ind = curr[1];
            if(rank == 1)
                res[ind] = "Gold Medal";
            else if(rank == 2)
                res[ind] = "Silver Medal";
            else if(rank==3)
                res[ind] ="Bronze Medal";
            else 
                res[ind]=String.valueOf(rank);
            rank++;
        }
        return res;
    }
}