class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";
        int count=t.length();
        int left=0, right=0, start=0, minLen=Integer.MAX_VALUE;
        int []freq= new int[128];
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)]++;
        }
        while(right<s.length()){
            char ch= s.charAt(right);
            freq[ch]--;
            if(freq[ch]>=0){
                count--;
            }
            while(count==0){
                if(right+1-left<minLen){
                     minLen=right-left+1;
                     start=left;
                     }
                char l = s.charAt(left);
                freq[l]++;
                if(freq[l]>0){
                    count++;
                }
                left++;
            }
            right++;
        }
        if(minLen==Integer.MAX_VALUE) return "";
        return s.substring(start, start+minLen);
    }
}