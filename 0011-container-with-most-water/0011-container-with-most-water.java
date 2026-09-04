class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxWater=0;
        while(left<right){
            int width=right-left;
            int waterheight=Math.min(height[left],height[right]);
            int area=width*waterheight;
            maxWater=Math.max(area,maxWater);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;
    }
}