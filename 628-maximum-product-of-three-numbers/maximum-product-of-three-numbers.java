class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int product=1;
        for(int i=0;i<nums.length;i++){
            if(nums[0]>=0)
            { 
            product=nums[n-3]*nums[n-2]*nums[n-1];
            return product;
            }
            else
            {
                int max=nums[n-1] * nums[n-2] * nums[n-3];
                int max1=nums[0] * nums[1] * nums[n-1];
                return(max>max1?max:max1);

            }
           
        
        }

     return 0;    
    }
}