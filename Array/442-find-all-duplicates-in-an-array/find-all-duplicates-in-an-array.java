class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;

        for(int i = 0;  i < n;  i++){
            int val =  Math.abs(nums[i]);
            int index = val -1;
            if(nums[index] < 0){
                list.add(val);
            }else{
                nums[index] = -nums[index];
            }
        }
        return list;
    }
}