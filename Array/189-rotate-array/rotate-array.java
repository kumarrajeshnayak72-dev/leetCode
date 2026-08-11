class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        k = k % n;

        reverseArray(nums,0,n-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,n-1);


        
 
    }
           public void reverseArray(int[]nums, int starting, int ending){
            
            while(starting <= ending){
                int temp = nums[ending];
                nums[ending] = nums[starting];
                nums[starting] = temp;

                starting++;
                ending--;
            }
        }
}