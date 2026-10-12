class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int arr[] = { -1, -1 };
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i] + nums[j] == target && nums[i] > nums[j] && i != j) {
                    int product = nums[i] * nums[j];
                    if (product > max) {
                        max = product;
                        arr[0] = i;
                        arr[1] = j;
                    }

                }
            }
        }
        return arr;

    }
}