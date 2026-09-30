public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map  = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int need = target - nums[i];
            if(map.containsKey(need)){
                return new int [] {i, map.get(need)};
            }else{
                map.put(nums[i],i);
            }
        }

        return new int [] {};
    }
}