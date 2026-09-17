class Solution {
    public int majorityElement(int[] nums) {
        int elem = nums[0];
        int cnt = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == elem){
                cnt++;
            }else{
                cnt--;
            }
            if(cnt == 0){
                elem = nums[i+1];
            }
        }
        return elem;
    }
}
