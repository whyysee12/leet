class Solution {
    public int averageValue(int[] nums) {
        int count=0;
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            if(nums[i]%3==0 && nums[i]%2==0){
                sum+=nums[i];
                count++;
            }

        }
        if(count<1) return 0;
        else return sum/count;
    }
}