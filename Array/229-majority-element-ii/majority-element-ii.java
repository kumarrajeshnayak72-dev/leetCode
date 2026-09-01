class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;
        int repeat = n / 3;

        for (int num : nums) {
            if (map.containsKey(num)) {
                int val = map.get(num);
                map.put(num, val + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (int num : map.keySet()) {
            if (map.get(num) > repeat) {
                ans.add(num);
            }
        }

        return ans;
    }
}
