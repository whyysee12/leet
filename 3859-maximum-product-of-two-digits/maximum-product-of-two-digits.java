class Solution {
    public int maxProduct(int n) {
        String s = Integer.toString(n);
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
       return (chars[chars.length - 1] - '0') * (chars[chars.length - 2] - '0');
        
    }
}