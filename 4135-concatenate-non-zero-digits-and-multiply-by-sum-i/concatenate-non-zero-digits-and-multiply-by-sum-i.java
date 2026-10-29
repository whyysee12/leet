class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        int finall=0;
        int k=1;
        while(n>0){
            int digit=n%10;
            if(digit!=0){
                sum+=digit;
                finall+=k*digit;
                k*=10;

            }
            n=n/10;

        }
        return sum*finall;

        
    }
}