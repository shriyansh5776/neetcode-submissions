
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> st = new ArrayDeque<>();

        for (int asteroid : asteroids) {
            boolean alive = true;

            while (alive && asteroid < 0 && !st.isEmpty() && st.peek() > 0) {
                if (st.peek() < Math.abs(asteroid)) {
                    st.pop();
                } else if (st.peek() == Math.abs(asteroid)) {
                    st.pop();
                    alive = false;
                } else {
                    alive = false;
                }
            }

            if (alive) {
                st.push(asteroid);
            }
        }

        int[] result = new int[st.size()];

        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = st.pop();
        }

        return result;
    }
}
