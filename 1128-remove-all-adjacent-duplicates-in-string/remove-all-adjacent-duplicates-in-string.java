class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st = new Stack<>();
        int n=s.length();
        st.push(s.charAt(0));
        for(int i=1;i<n;i++){
            if(st.size()!=0 && st.peek()==s.charAt(i)){
                st.pop();
                continue;
            }
            else st.push(s.charAt(i));

        }
        String ans="";
        while(st.size()!=0){
            ans=st.pop()+ans;
        }
        return ans;
        
    }
}