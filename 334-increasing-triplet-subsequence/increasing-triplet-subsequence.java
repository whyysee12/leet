class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        int small=Integer.MAX_VALUE;
        int big=Integer.MAX_VALUE;
       

        for(int i=0;i<n;i++){
            if(nums[i]<small) small=nums[i];
            if(nums[i]>small && nums[i]<big) big=nums[i];
            if(nums[i]>big) return true;
        }
        return false;
    }
}

        