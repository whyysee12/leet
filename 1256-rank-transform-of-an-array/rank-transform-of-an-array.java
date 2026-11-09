import java.util.Arrays;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) return arr;
        
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        
       
        int uniqueCount = 1;
        for (int i = 1; i < sorted.length; i++) {
            if (sorted[i] != sorted[i - 1]) {
                sorted[uniqueCount] = sorted[i];
                uniqueCount++;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Arrays.binarySearch(sorted, 0, uniqueCount, arr[i]) + 1;
        }
        
        return arr;
    }
    
}