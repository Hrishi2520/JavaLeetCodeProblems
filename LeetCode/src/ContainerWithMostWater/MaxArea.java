public class MaxArea {
    public static int maxArea(int[] height) {
        int maxArea = 0;
        for(int i = 0; i < height.length; i++) {
            for(int j = i+1; j < height.length; j++) {
                int width = j - i;
                maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * width);
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}