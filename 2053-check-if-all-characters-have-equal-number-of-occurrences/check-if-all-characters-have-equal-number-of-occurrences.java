class Solution {
    public boolean areOccurrencesEqual(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int freq = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    freq++;
            }

            if (i == 0) {
                count = freq;
            } else if (freq != count)
                return false;
        }
        return true;

    }
}