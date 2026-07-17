class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        boolean valid = true;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.charAt(i) == ('[') || s.charAt(i) == ('{') || s.charAt(i) == ('(')) {
                st.push(s.charAt(i));
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.peek();

                if ((top == '(' && ch == ')') ||
                        (top == '{' && ch == '}') ||
                        (top == '[' && ch == ']')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        valid = st.isEmpty();
        return valid;
    }
}

