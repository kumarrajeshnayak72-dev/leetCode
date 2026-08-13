class Solution {
    public int findMiddleIndex(int[] nums) {
        int left = 0;
        int total = 0;

        for(int num : nums){
            total += num;
        }

        for(int i = 0; i < nums.length; i++){
            int right = total - left - nums[i];
            if(left == right){
                return i;
            }
            left  += nums[i];
        }
        return -1;
    }
}