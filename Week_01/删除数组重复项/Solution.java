package ltd.pdx.del;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                if (i != j) {
                    nums[j] = nums[i];
                }
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{
                1, 2, 3, 3, 3, 4, 5, 6, 6, 7
        };
        System.out.println(new Solution().removeDuplicates(nums));
    }
}