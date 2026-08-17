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

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        long prefixSum = 0;
        int minLength = nums.length;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            int rem = (int)(prefixSum % p);

            if (rem < 0) {
                rem += p;
            }

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