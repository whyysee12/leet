class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int arr[]= new int[n*2];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        int j=0;
        int k=n-1;
        while(j<=k){
            int temp=nums[j];
            nums[j]=nums[k];
            nums[k]=temp;
            j++;
            k--;
        }
        for(int i=n;i<2*n;i++){
            arr[i]=nums[i-n];
        }
        return arr;

        
    }
}