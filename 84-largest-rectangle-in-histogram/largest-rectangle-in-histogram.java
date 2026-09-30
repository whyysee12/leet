class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] right = new int[n];
        int[] left = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (st.size() > 0 && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.size() == 0)
                right[i] = n;
            else {
                right[i] = st.peek();
            }
            st.push(i);
        }
        if (st.size() > 0) {
            while (st.size() != 0) {
                st.pop();
            }
        }
        for (int i = 0; i < n; i++) {
            while (st.size() > 0 && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.size() == 0)
                left[i] = -1;
            else {
                left[i] = st.peek();
            }
            st.push(i);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int width=right[i]-left[i]-1;
            int height=heights[i];
            int area=width*height;
            ans=Math.max(ans,area);

        }
        return ans;

    }
}