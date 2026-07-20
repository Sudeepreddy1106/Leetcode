class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        if (s.length() == 1 && s.charAt(0)=='*') {
            return "";
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}

