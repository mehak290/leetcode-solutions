class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int sum=0;
        for(String ch : operations){
                if(ch.equals("+")){
                    int last=st.pop();
                    int secLast=st.peek();
                    st.push(last);
                    st.push(secLast+last);
                }
                else if(ch.equals("D"))
                    st.push(2*st.peek());

                else if(ch.equals("C"))
                    st.pop();   
                else{
                    st.push(Integer.parseInt(ch));
                }

            }
            while(!st.isEmpty()){
                sum+=st.pop();
            }
        
        return sum;

    }
}