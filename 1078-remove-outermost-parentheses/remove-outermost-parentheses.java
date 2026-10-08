class Solution {
    public String removeOuterParentheses(String s) {
        int count1 = 0;
        int count2 = 0;
        String result = "";
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                count1++;
                if (count1 > 1)
                    result += '(';
            }
            if (ch == ')') {
                count2++;
                if (count2 < count1)
                    result += ')';
            }
            if (count1 == count2) {
                count1 = 0;
                count2 = 0;
            }

        }
        return result;

    }
}