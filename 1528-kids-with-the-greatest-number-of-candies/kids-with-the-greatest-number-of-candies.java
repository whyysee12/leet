class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int extraCandies) {
        int n = arr.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        List<Boolean> new_arr = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            if ((arr[j] + extraCandies) >= max) {
                new_arr.add(true);
            } else
                new_arr.add(false);
        }
        return new_arr;
    }
}