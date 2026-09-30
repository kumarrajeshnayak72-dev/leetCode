class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = nums.length-1;

            while(j < k){
                long sum = (long) nums[i] + nums[j] + nums[k];

                if(sum == 0){
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++; k--;

                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(j < k && nums[k] == nums[k+1]) k--;
                }
                else if(sum < 0) j++;
                else k--;
            }
        }
        return res;
    }
}