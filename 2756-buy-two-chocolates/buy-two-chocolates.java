class Solution {
    public int buyChoco(int[] prices, int money) {
        int n=prices.length;
        int cost=1000;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum=prices[i]+prices[j];
                if(sum<cost) cost=sum;
            }
            
        
        
        
    }
    if(cost<=money) return money-cost;
    return money;
}
}