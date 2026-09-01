class Solution {
    public int majorityElement(int[] nums) {
        int elem = nums[0];
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                count++;
                elem = nums[i];
            }else if(nums[i] == elem){
                count++;
            }else{
                count--;
            }
        }

        int cnt = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == elem) cnt++;
        }
        if(cnt > (nums.length/2)){
            return elem;
        }
        return -1;
    }
}