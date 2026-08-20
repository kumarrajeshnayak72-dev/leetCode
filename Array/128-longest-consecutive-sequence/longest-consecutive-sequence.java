class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);

        int count = 1;
        int max = 0;

        if (nums.length == 0) return 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                count++;
            }else if (nums[i] == nums[i - 1]) {

            }else {
                max = Math.max(max, count);
                count = 1;
            }
        }
        max = Math.max(max, count);
        return max;
    }
}