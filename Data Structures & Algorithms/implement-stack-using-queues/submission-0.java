class MyStack {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    Queue<Integer> t;

    public MyStack() {

    }

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        int n = q1.size();
        for (int i = 0; i < n - 1; i++) {
            q2.add(q1.remove());
        }
        int ans = q1.remove();
        t = q1;
        q1 = q2;
        q2 = t;
        return ans;
    }

    public int top() {
        int n = q1.size();

        for (int i = 0; i < n - 1; i++) {
            q2.add(q1.remove());
        }

        int ans = q1.peek();

        q2.add(q1.remove());

        t = q1;
        q1 = q2;
        q2 = t;

        return ans;
    }

    public boolean empty() {
        if (q1.size() == 0)
            return true;
        else
            return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */