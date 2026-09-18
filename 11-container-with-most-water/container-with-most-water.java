class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int width;
        int maxWater=0;
        while(left<right){
            width=right-left;
            int ht= Math.min(height[right],height[left]);
            int area=width*ht;
            maxWater= Math.max(maxWater,area);
             if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;  
    }
   
}