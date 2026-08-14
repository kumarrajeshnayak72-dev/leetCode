class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int num : nums){
            int val = k - num;
            if(map.containsKey(val) && map.get(val) > 0){
                count++;

                map.put(val,map.get(val)-1);
            }else{
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        return count;
    }
}