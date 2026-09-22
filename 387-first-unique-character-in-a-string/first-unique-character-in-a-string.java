class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        char[] ch = s.toCharArray();
        for (int i = 0; i < n; i++) {
            boolean unique = false;
            for (int j = 0; j < n; j++) {
                if (i != j && ch[i] == ch[j]) {
                    unique = true;
                    break;
                }
            }

            if (unique == false)
                return i;
        }

        return -1;
    }
}