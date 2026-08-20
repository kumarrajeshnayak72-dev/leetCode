class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];

        arr1[0] = nums[0];
        arr2[0] = nums[1];

        int index1 = 0;
        int index2 = 0;

        for (int i = 2; i < nums.length; i++) {
            if (arr1[index1] > arr2[index2]) {
                index1++;
                arr1[index1] = nums[i];
            } else {
                index2++;
                arr2[index2] = nums[i];
            }
        }

        int[] result = new int[nums.length];

        int k = 0;

        for (int i = 0; i <= index1; i++) {
            result[k++] = arr1[i];
        }

        for (int i = 0; i <= index2; i++) {
            result[k++] = arr2[i];
        }

        return result;
    }
}