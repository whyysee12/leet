class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a=nums.length;
        int new_arr[]=new int[a];
        int i=0;
        int j=n;
        for(int k=0;k<n;k++){
            new_arr[k*2]=nums[i];
            new_arr[k*2+1]=nums[j];
            i++;
            j++;
        }
        
        return new_arr;     

        
    }
}