class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> record = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (record.containsKey((target - nums[i]))) {
                return new int[] {record.get(target - nums[i]), i};
            } else {
                record.put(nums[i], i);
            }
        }
        return new int[2];
    }
}