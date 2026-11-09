class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) return arr;
        
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        
       
        int rank = 1;
        for (int i = 1; i < sorted.length; i++) {
            if (sorted[i] != sorted[i - 1]) {
                sorted[rank] = sorted[i];
                rank++;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Arrays.binarySearch(sorted, 0, rank, arr[i]) + 1;
        }
        
        return arr;
    }
    
}