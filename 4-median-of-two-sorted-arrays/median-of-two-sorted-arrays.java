class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int []arr= new int[n+m];
        for(int i=0;i<n;i++){
            arr[i]=nums1[i];
        }
        for(int j=0;j<m;j++){
            arr[j+n]=nums2[j];
        }
        Arrays.sort(arr);
        int k=arr.length;
        if(arr.length%2==0) return(arr[k/2]+arr[(k-1)/2])/2.0;
        else return arr[k/2];
        
    }
}