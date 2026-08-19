class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int []new_arr = new int[n];
        int k=n-1;
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0) {
                new_arr[j]=nums[i];
                j++;}
            else
            {
                new_arr[k]=nums[i];
                k--;
            }
        }
        return new_arr;
    }
}