class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Deque<Integer> q= new LinkedList();
        Arrays.sort(deck);
        int n=deck.length;
        for( int i=n-1;i>=0;i--){
            if(!q.isEmpty()){
                q.offerFirst(q.pollLast());
            }
            q.offerFirst(deck[i]);
        }
        int[] res= new int[n];
        for(int i=0;i<n;i++){
            res[i]=q.poll();
        }
        return res;
            }
}