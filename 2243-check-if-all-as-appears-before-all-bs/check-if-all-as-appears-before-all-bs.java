class Solution {
    public boolean checkString(String s) {
        Stack<Character>st = new Stack<>();
        char[] ch = s.toCharArray();
        int i=0;
        int n=s.length();
        while(i<n && s.charAt(i)=='a'){
            st.push(s.charAt(i));
            i++;
        }
        while(i<n && s.charAt(i)=='b'){
           st.push(s.charAt(i));
           i++;
        }
        if(i<n && s.charAt(i)=='a'){
            return false;
        }
        return true;
        
        
        
    }
}