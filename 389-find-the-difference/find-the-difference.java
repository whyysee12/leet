class Solution {
    public char findTheDifference(String s, String t) {
        char[] chars = t.toCharArray();
        Arrays.sort(chars);
        char[] chars2 = s.toCharArray();
        Arrays.sort(chars2);
        for (int i = 0; i < chars2.length; i++) {
            if (chars[i] != chars2[i])
                return chars[i];
        }
        return chars[chars.length - 1];

    }
}