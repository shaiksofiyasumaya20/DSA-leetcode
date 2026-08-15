class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int mArea=0;
        while(left<right)
        {
            int width=right-left;
            int he=Math.min(height[right],height[left]);
            int area=width*he;
            mArea = Math.max(mArea,area);
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return mArea;
        
    }
}