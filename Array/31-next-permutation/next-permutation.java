class Solution {
    void reverse(int [] arr, int st, int end){
        while(st < end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;

            st++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;

        for(int i = n - 2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
           reverse(nums, 0, n-1);
           return;
        }
        for(int i = n - 1; i >= idx; i--){
            if(nums[i] > nums[idx]){
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;

                break;
            }
        }
        reverse(nums, idx+1, n-1);
    }
}
