class Solution {
    public void duplicateZeros(int[] arr) {
        int zeros = 0;
        for (int num : arr) {
            if (num == 0) {
                zeros++;
            }
        }

        int index = arr.length + zeros - 1;

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] == 0) {
                if (index < arr.length) {
                    arr[index] = 0;
                }
                index--;

                if (index < arr.length) {
                    arr[index] = 0;
                }
                index--;

            } else {
                if (index < arr.length) {
                    arr[index] = arr[i];
                }
                index--;
            }
        }
    }
}