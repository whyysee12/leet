class Solution {
    public boolean isValid(String s) {
        char []ch = new char[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(' || c=='[' || c=='{' ){
                top++;
                ch[top]=c;
            }
            else{
                if(top==-1) return false;
                char x = ch[top];
                if(c==')' && x=='(' || c=='}' && x=='{' || c==']' && x=='[') top--;
                else return false;
            }

        }
        return top==-1;
    }
}