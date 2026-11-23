class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
       
        Queue<Integer> q=new ArrayDeque<>();
        int count=0;
        for(int i=0;i<tickets.length;i++){
            q.add(i);
        }
        while(tickets[k]!=0){
            int i=q.remove();
            tickets[i]--;
            count++;
            if(tickets[i]>0) q.add(i);
        }
        return count;

        
    }
}