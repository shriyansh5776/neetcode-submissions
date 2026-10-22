
class MinStack {
    Deque<Long> st = new ArrayDeque<>();
    long min = Long.MAX_VALUE;

    public MinStack() {}

    public void push(int val) {
        if (st.isEmpty()) {
            st.push((long) val);
            min = val;
        } else {
            if (val < min) {
                st.push(2L * val - min);
                min = val;
            } else {
                st.push((long) val);
            }
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        long x = st.pop();

        if (x < min) {
            min = 2 * min - x;
        }

        if (st.isEmpty()) {
            min = Long.MAX_VALUE;
        }
    }

    public int top() {
        if (st.isEmpty()) return -1;

        long x = st.peek();

        if (x < min) {
            return (int) min;
        }

        return (int) x;
    }

    public int getMin() {
        if (st.isEmpty()) return -1;
        return (int) min;
    }
}
