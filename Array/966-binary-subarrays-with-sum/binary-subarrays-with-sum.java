class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer>map =  new HashMap<>();
        map.put(0, 1);
        int count = 0;
        
        int [] prefixSum = new int [nums.length];
        prefixSum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefixSum[i] = prefixSum[i-1]+nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            int diff = prefixSum[i] - goal;

            if(map.containsKey(diff)){
                count += map.get(diff);
            }

            map.put(prefixSum[i],map.getOrDefault(prefixSum[i],0)+1);
        }
        return count;
    }
}