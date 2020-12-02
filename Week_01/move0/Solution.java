package ltd.pdx.move0;

/**
 * @author buyanping
 * @description
 * @date 2020/12/2
 */
public class Solution {

    public void move0(int nums[]) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != 0 && nums[j] == 0) {
                nums[j] = nums[i];
                nums[i] = 0;
                j++;
            } else if (nums[i] == 0 && nums[j] != 0) {
                j = i;
            }
        }
    }

    public static void main(String[] args) {
        int rs[] = new int[]{1, 1, 0, 10, 5, 0, 4, 0, 0, 2, 100};
        new Solution().move0(rs);
    }
}
