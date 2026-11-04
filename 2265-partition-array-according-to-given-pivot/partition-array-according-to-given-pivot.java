class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> snums = new ArrayList<>();
        ArrayList<Integer> bnums = new ArrayList<>();
        ArrayList<Integer> pnums = new ArrayList<>();
        
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot) snums.add(nums[i]);
            else if(nums[i]>pivot) bnums.add(nums[i]);
            else pnums.add(nums[i]);
        }
        int index=0;
        for(int x:snums){
            nums[index]=x;
            index++;
        }
        for(int x:pnums){
            nums[index]=x;
            index++;
        }
        for(int x:bnums){
            nums[index]=x;
            index++;
        }

        return nums;


    
        
        
    }
}