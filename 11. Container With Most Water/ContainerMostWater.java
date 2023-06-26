package solution;

public class ContainerMostWater {
    public int maxArea(int[] height) {
        int left = 0; // Pointer for the left end
        int right = height.length - 1; // Pointer for the right end
        int maxArea = 0; // Maximum area of water

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

}
