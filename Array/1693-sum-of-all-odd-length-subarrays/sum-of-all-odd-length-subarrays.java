class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int left = i + 1;
            int right = n - i;

            int oddLeft = (left + 1) / 2;
            int evenLeft = left / 2;

            int oddRight = (right + 1) / 2;
            int evenRight = right / 2;

            int count = oddLeft * oddRight
                      + evenLeft * evenRight;

            sum += arr[i] * count;
        }

        return sum;
    }
}