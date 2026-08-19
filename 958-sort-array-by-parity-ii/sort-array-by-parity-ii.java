class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=1;
        int []new_arr= new int[n];

        for(int k=0;k<n;k++){
            if(nums[k]%2==0) {
                 new_arr[i]=nums[k];
                 i+=2;
            }
            else {
                new_arr[j]=nums[k];
                j+=2;}
           

        }
        return new_arr;
        
    }
}