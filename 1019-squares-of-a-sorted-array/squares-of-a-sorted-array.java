class Solution {
    public int[] sortedSquares(int[] arr) {
        
        int n=arr.length;
        int [] new_arr= new int[n]; 
        for(int i=0;i<n;i++){
            new_arr[i]=arr[i]*arr[i];
        }
        Arrays.sort(new_arr);
        return new_arr;
        
    }
}