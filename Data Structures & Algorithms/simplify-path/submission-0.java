class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        Deque<String> st = new ArrayDeque<String>();
        if (parts.length == 0)
            return "/";
        for (String part : parts) {
            if (part.equals(".") || part.equals("")) {
                continue;
            } else if (!st.isEmpty() && part.equals("..")) {
                st.pop();
            } else if (st.isEmpty() && part.equals("..")) {
                continue;
            } else {
                st.push(part);
            }
        }
        if (st.isEmpty()) {
            return "/";
        }
         StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            ans.insert(0, "/" + st.pop());
        }

        return ans.length() == 0 ? "/" : ans.toString();
    }
}