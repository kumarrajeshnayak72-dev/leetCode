class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int arraySum = 0;
        for(int nm : nums){
            arraySum += nm;
        }

        int total = n*(n+1)/2;

        return total - arraySum;

    }
}