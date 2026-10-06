class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i]%3;
            if(temp==1 || temp==2) count++;

        }
        return count;
        
    }
}