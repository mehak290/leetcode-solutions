import java.util.*;
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for( int stone:stones){
            pq.offer(stone);}
            while(pq.size()>1){
                int x= pq.poll();
                int y=pq.poll();
                int val = Math.abs(x-y);
                if(val!=0)
                    pq.offer(val);
            }
        
        return pq.isEmpty()? 0:pq.peek();
    }
}