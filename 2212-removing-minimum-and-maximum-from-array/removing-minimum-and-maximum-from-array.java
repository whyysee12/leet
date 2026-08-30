class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int mindex = 0;
        int maxdex = 0;
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
                mindex = i;
            }
        }
        for (int j = 0; j < n; j++) {
            if (nums[j] > max) {
                max = nums[j];
                maxdex = j;
            }

        }
        if (mindex <= n / 2 && maxdex <= n / 2)
            return (mindex > maxdex ? mindex + 1 : maxdex + 1);
        if (mindex > n / 2 && maxdex > n / 2)
            return (mindex < maxdex ? n - mindex : n - maxdex);
        if (mindex <= n / 2 && maxdex > n / 2)
            return Math.min(mindex + 1 + n - maxdex, Math.min(maxdex + 1, n - mindex));
        if (mindex > n / 2 && maxdex <= n / 2)
            return Math.min(maxdex + 1 + n - mindex, Math.min(mindex + 1, n - maxdex));

        return (0);
    }

}