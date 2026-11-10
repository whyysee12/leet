class Solution {
    public String triangleType(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[0]==nums[1] && nums[1]==nums[2]) return "equilateral";
        }
        for(int j=0;j<nums.length;j++){
            if(nums[0]+nums[1]>nums[2] && nums[1]+nums[2]>nums[0] && nums[0]+nums[2]>nums[1]){
                if(nums[0]==nums[1] || nums[0]==nums[2] || nums[1]==nums[2]) return "isosceles";
                else return "scalene";

            }

        }

        return "none";
        
    }
}