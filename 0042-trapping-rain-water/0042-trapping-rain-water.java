class Solution {
    public int trap(int[] height) {
        int area = 0;
        
        int left = 0;
        int right = height.length - 1;
        int left_max = 0;
        int right_max = 0;
        while (left < right) {
            // if height[left] is smaller than height[right]
            if (height[left] < height[right]){
                // if (height[left] >= left_max, update left_max
                if (height[left] >= left_max){
                    
                    left_max = height[left];
                } 
                // else add left_max - height[left] to area
                else {
                    area += left_max - height[left];
                }
                left++;
            }
            else {
                // if height[right] >= right_max, update right_max
                if (height[right] >= right_max){
                    right_max = height[right];
                } 
                // else add right_max - height[right] to area
                else {
                    area += right_max - height[right];
                }
                right--;
            }
        }
        return area;
    }
}