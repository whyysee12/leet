class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int new_arr[] = new int[nums1.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                new_arr[k] = nums1[i];
                i++;
            } else {
                new_arr[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            new_arr[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            new_arr[k] = nums2[j];
            j++;
            k++;
        }
        for (int x = 0; x < m + n; x++) {
            nums1[x] = new_arr[x];
        }

    }
}