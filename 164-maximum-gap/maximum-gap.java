class Solution {
    public int maximumGap(int[] arr) {
       Arrays.sort(arr);
        int max=0;
        for(int i=0;i<arr.length-1;i++){
            int diff=arr[i+1]-arr[i];
            if(diff>max) max=diff;
            
        }
        return max;
        
        
    }
}