class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
        }

        int[] prefixSum = new int[nums.length];

        prefixSum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            int required = prefixSum[i] - k;

            if (map.containsKey(required)) {
                count += map.get(required);
            }

            map.put(
                prefixSum[i],
                map.getOrDefault(prefixSum[i], 0) + 1
            );
        }

        return count;
    }
}