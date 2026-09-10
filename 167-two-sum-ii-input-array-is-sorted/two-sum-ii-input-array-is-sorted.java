class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n=arr.length;
        int left=0;
        int right=n-1;
        int index[]= new int[2];
        for(int i=0;i<n;i++){
            if(arr[left]+arr[right]<target) left++;
            else if(arr[left]+arr[right]>target) right--;
            else{
                index[0]=left+1;
                index[1]=right+1;
               
            }
        }
        return index;
    }
}