class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int cnt1 = 0;
        int cnt2 = 0;
        int elem1 = Integer.MIN_VALUE;
        int elem2 = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(cnt1 == 0 && nums[i] != elem2){
                cnt1 = 1;
                elem1 = nums[i];
            }else if(cnt2 == 0 && nums[i] != elem1){
                cnt2 = 1;
                elem2 = nums[i];
            }else if(nums[i] == elem1){
                cnt1++;
            }else if(nums[i] == elem2){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0; cnt2 = 0;

        for(int i = 0; i < nums.length; i++){
            if(elem1 == nums[i]) cnt1++;
            if(elem2 == nums[i]) cnt2++;
        }

        if(cnt1 > nums.length/3) ans.add(elem1);
        if(cnt2 > nums.length/3) ans.add(elem2);

        return ans;
    }
}
