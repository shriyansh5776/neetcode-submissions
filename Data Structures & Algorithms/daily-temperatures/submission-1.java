class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Deque<Integer> st = new ArrayDeque<Integer>();
        for(int i = 0 ;i<n;i++){
            while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
                int previousDay = st.pop();
                ans[previousDay] = i - previousDay;
            }
            st.push(i);
            
        }
        return ans;
    }
}
