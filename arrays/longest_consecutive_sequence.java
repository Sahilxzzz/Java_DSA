package arrays;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> st = new HashSet<>();
        for (int num : nums) {
            st.add(num);
        }

        int longest = 0;

        for (int it : st) {
            // start only if it is the beginning of a sequence
            if (!st.contains(it - 1)) {
                int cnt = 1;
                int x = it;

                while (st.contains(x + 1)) {
                    x++;
                    cnt++;
                }

                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}
