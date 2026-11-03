class FreqStack {
    HashMap<Integer,Integer> freqMap ;
    HashMap<Integer,Stack<Integer>> freqStack ;
    int maxFreq;
    public FreqStack() {
        freqMap = new HashMap<>();
        freqStack = new HashMap<>();
        maxFreq= 0 ;
    }
    
    public void push(int val) {
        int freq = freqMap.getOrDefault(val,0)+1;
        freqMap.put(val , freq);
        maxFreq = Math.max(maxFreq,freq);
        freqStack.computeIfAbsent(freq, f->new Stack()).push(val);
    }
    
    public int pop() {
        Stack<Integer> st = freqStack.get(maxFreq);
        int top = st.pop();
        if(st.isEmpty()) maxFreq --;
        freqMap.put(top,freqMap.get(top)-1);
        return top ;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */