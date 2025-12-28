package arrays;

class longestSubarray {
    public int longestSubarray(int[] arr, int k) {
        int i = 0, sum = 0, maxLength = 0;

        for (int j= 0; j < arr.length; j++) {

            sum += arr[j];  // expand window

            // shrink window if sum > k
            while (sum > k) {
                sum -= arr[i];
                i++;
            }

            // check if sum == k
            if (sum == k) {
                maxLength = Math.max(maxLength, j - i + 1);
            }
        }

        return maxLength;
    }
}
