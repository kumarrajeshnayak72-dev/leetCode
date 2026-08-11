class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int totalsum = n*(n+1)/2;
        int sum = 0;
        for(int k:nums){
            sum += k;
        }
        int missing = totalsum - sum;

        return missing;
    }
}