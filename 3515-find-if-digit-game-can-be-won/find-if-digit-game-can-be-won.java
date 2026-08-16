class Solution {
    public boolean canAliceWin(int[] nums) {
        int ssum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=10) continue;
            ssum+=nums[i];
            
        }
        int dsum=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]<10) continue;
            dsum+=nums[j];
           
        }
        if(ssum==dsum) return false;
        else return true;

        
    }
}