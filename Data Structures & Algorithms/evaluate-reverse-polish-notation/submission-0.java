class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> st = new ArrayDeque<Integer>();
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            if (token.equals("+")) {
                int x = st.pop();
                int y = st.pop();
                st.push(y + x);
            } else if (token.equals("-")) {
                int x = st.pop();
                int y = st.pop();
                st.push(y - x);
            } else if (token.equals("*")) {
                int x = st.pop();
                int y = st.pop();
                st.push(y * x);
            } else if (token.equals("/")) {
                int x = st.pop();
                int y = st.pop();
                st.push(y / x);
            } else {
                st.push(Integer.parseInt(token));
            }
        }
    return st.pop();
    }
}

