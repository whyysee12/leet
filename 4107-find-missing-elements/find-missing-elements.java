class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) max=nums[i];
        }
        int min=nums[0];
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min) min=nums[i];
        }

        for(int j=min+1;j<max;j++){
            boolean found=false;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==j){
                    found=true;
                    break;
                }
            }
            if(found==false){
                ans.add(j);
            }
        }
        return ans;
        
    }
}