class Solution {
    public int minTimeToType(String word) {
        char curr='a';
        int time=0;
        for(char ch:word.toCharArray()){
            int diff=Math.abs(ch-curr);
            int minTime = Math.min(diff, 26-diff);
            time+=minTime+1;
            curr=ch;
        }
        return time;
    }
}