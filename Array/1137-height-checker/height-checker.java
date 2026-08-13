class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int count = 0;

        int [] res = new int [n];
        int k = 0;
        for(int num : heights){
            res[k] = num;
            k++;
        }

        Arrays.sort(res);

        for(int i = 0; i < n; i++){
            if(res[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}