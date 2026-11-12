class Solution {
    public int mostWordsFound(String[] sentences) {
        int len=0;
        for(int i=0;i<sentences.length;i++){
            String words = sentences[i];
            String [] arr = words.split(" ");
            len=Math.max(len, arr.length);

        }
        return len;
    }
}