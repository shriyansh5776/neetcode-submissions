class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> st = new ArrayDeque<Integer>();
        int maxArea = 0 ;
        int nse = 0 ;
        int pse = 0 ;
        int element = 0 ;
        for(int i =0 ;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()]>heights[i] ){
                element = st.pop() ;
                nse = i ;
                pse = st.isEmpty() ? -1 : st.peek();
                maxArea =Math.max(maxArea , (nse-pse-1) * heights[element]);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            nse = heights.length;
            element  = st.pop();
            pse = st.isEmpty() ? -1 : st.peek();
            maxArea =Math.max(maxArea , (nse-pse-1) * heights[element]);
        }
        return maxArea ;
    }
}
