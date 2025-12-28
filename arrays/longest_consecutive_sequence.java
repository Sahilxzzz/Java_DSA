package arrays;

import java.util.*;

class longest_consecutive_sequence {

    public int longestConsecSeq(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int ls = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] - 1 == ls) {
                cnt += 1;
                ls = arr[i];
            } else if (arr[i] != ls) {
                cnt = 1;
                ls = arr[i];
            }
            longest = Math.max(longest, cnt);
        }

    return longest;

    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 100, 4, 102, 101, 2, 3, 1 };

        longest_consecutive_sequence solution = new longest_consecutive_sequence();
        int ans = solution.longestConsecSeq(arr);

        System.out.println(ans);
    }
}
