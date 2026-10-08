class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList();
        for( int preferences : students){
            q.offer(preferences);
        }

        int i=0;
        int count=0;
        while(!q.isEmpty()){
            if(sandwiches[i] == q.peek()){
                q.poll();
                i++;
                count = 0;
            }
            else{
                count++;
                q.offer(q.poll());
            }
            if(q.size()==count)
            return q.size();
        }
        return 0;
    }
}