class Solution {
    public boolean check(int[] arr) {
        int count=0;
        int left=0;
        int right=arr.length-1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                count++;
            }
            
        }
        if(count==0) return true;
        if(count==1 && arr[left]>=arr[right]) return true;
        return false;

    }
}