/***
Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container.
*/




public class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        
        int maxArea=0;
        int i=0; int j=n-1;
        while(i<j){
            int area = (j-i) * Math.min(height[i],height[j]);
            maxArea = Math.max(maxArea,area);
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxArea;
    }
}
