class Solution {
    public int countKeyChanges(String s) {
        s = s.toLowerCase();
        int count = 0;
        int n = s.length();

        for (int i = 0; i < n-1; i++) {
            char ch = s.charAt(i);

            char ch2 = s.charAt(i+1);
            if (ch != ch2)
                count++;

        }
        return count;

    }
}