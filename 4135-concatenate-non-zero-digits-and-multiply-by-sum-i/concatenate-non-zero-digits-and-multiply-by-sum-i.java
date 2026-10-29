class Solution {
    public long sumAndMultiply(int n) {
        if(n==0) return 0;
        String res="";
        while(n>0){
            int digit=n%10;
            if(digit!=0){
                res=digit+res;
            }
            n=n/10;
        }
        int sum=0;
        long result = Long.parseLong(res);
        long num = result;
        while(num>0){
            int no=(int)num%10;
            sum+=no;
            num=num/10;

        }
        return result*sum;
        
    }
}