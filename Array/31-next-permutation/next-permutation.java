class Solution {
    public void nextPermutation(int[] nums) {

        int i = nums.length - 1;
        int j = nums.length - 2;

        while (j >= 0 && nums[i] <= nums[j]) {
            i--;
            j--;
        }

        if (j >= 0) {
            i = nums.length - 1;

            while (nums[i] <= nums[j]) {
                i--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        
        i = j + 1;
        int k = nums.length - 1;

        while (i < k) {
            int temp = nums[i];
            nums[i] = nums[k];
            nums[k] = temp;

            i++;
            k--;
        }
    }
}