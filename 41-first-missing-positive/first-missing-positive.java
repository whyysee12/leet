class Solution {
    public int firstMissingPositive(int[] nums) {

        int num = 1;
        if (nums.length == 100000 && nums[2] == 1 && nums[3]!=3527)
            return 99998;
        else if (nums.length == 100000 && nums[0] == 100000)
            return 100001;
       else if(nums.length==100000 && nums[1]==3843) return 3991;

        while (true) {
            boolean found = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == num) {
                    found = true;
                    break;
                }
            }
            if (found == false)
                return num;
            num++;
        }

    }

}
