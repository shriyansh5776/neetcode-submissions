class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> st = new ArrayDeque<Integer>();
        int sum = 0 ;
        for(int i = 0 ;i<operations.length;i++){
            if(operations[i].equals("+")){
                int f = st.peek();
                st.pop();
                int s = st.peek() ;
                st.push(f);
                st.push(f+s);
            }
            else if(operations[i].equals("D")){
                int f = st.peek();
                st.push(2*f);
            }
            else if(operations[i].equals("C")){
                st.pop();
            }
            else {
                st.push(Integer.parseInt(operations[i]));
            }
        }
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum ;
    }
}