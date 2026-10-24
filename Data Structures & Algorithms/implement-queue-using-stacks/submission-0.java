class MyQueue {
    Deque<Integer> s1 = new ArrayDeque<Integer>();
    Deque<Integer> s2 = new ArrayDeque<Integer>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        while(s1.size()!=1){
            s2.push(s1.pop());
        }
        int x = s1.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return x ;
    }
    
    public int peek() {
        while(s1.size()!=1){
            s2.push(s1.pop());
        }
        int x = s1.peek();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return x ;
    }
    
    public boolean empty() {
        if(s1.isEmpty() && s2.isEmpty()){
            return true ;
        }
        else return false ;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */