class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        int max=nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]>max) max=nums[i];
            sum+=nums[i];
        }
        int low=max;
        int high=sum;
        while(low<high){
            int mid=low+(high-low)/2;
            int count=1;
            int currsum=0;
            for(int i=0;i<n;i++){
                if(currsum+nums[i]<=mid){
                    currsum+=nums[i];
                }
                else{
                    count++;
                    currsum=nums[i];
                }
            }
            if(count<=k) high=mid;
            else low=mid+1;
        }
        return low;
        
    }
}