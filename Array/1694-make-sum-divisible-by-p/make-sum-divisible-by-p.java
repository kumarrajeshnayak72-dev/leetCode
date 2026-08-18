class Solution {
    public int minSubarray(int[] nums, int p) {
        long totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int target = (int)(totalSum % p);

        if (target == 0) {
            return 0;
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        long prefix = 0;
        int minLength = nums.length;

        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];

            int rem = (int)(prefix % p);

            int needed = (rem - target + p) % p;

            if (map.containsKey(needed)) {
                int length = i - map.get(needed);
                minLength = Math.min(minLength, length);
            }

            map.put(rem, i);
        }

        return minLength == nums.length ? -1 : minLength;
    }
}