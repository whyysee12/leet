class Solution {
    public double average(int[] arr) {
        int max=arr[0];
        int min=arr[0];
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max) max=arr[i];
            if(arr[i]<min) min=arr[i];
            sum+=arr[i];
        }
        double avg=(double)(sum-max-min)/(n-2);
        return avg;
    }
}