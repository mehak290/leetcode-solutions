class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
      int n = tickets.length;
      Queue<Integer> q = new ArrayDeque();
      for( int i=0;i<n;i++){
        q.offer(i);
      }
      int sec=0;
      while(!q.isEmpty()){
        int ind= q.poll();
        tickets[ind]--;
        sec++;
        if(tickets[ind]==0 && ind==k)
        return sec;
        if(tickets[ind]> 0) 
        q.offer(ind);
      }
      return sec;

    }
}