class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n=s.length();
        int start=0;
        int end=n-1;
        
        while(start<end){
            if(s.charAt(start) == s.charAt(end)) {
                start++;
                end--;

            }
            
            else return false;
            if(start>end) break;
        }
        return true;
        
    }
}