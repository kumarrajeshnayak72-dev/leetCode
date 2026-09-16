class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int val = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                val = Math.max(val, count);
            }else{
                count = 0;
            }
        }
        return val;
    }
}