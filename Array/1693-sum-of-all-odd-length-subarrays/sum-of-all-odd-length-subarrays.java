class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;

        for (int left = 0; left < arr.length; left++) {
            int currentSum = 0;

            for (int right = left; right < arr.length; right++) {
                currentSum += arr[right];

                if ((right - left + 1) % 2 == 1) {
                    sum += currentSum;
                }
            }
        }

        return sum;
    }
}