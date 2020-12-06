class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int m = (j - i) * Integer.min(height[i], height[j]);
            if (m > max) {
                max = m;
            }
            if (height[i] <= height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(new Solution().maxArea(nums));
    }
}