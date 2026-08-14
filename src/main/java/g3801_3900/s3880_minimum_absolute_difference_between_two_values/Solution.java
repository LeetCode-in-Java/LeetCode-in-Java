package g3801_3900.s3880_minimum_absolute_difference_between_two_values;

// #Easy #Array #Enumeration #Mid_Level #Biweekly_Contest_179
// #2026_08_13_Time_1_ms_(99.36%)_Space_46.20_MB_(85.90%)

public class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        int prev = -1;
        int last = -1;
        for (int i = 0; i < n; i++) {
            if (prev == -1) {
                if (nums[i] == 1) {
                    prev = 1;
                    last = i;
                } else if (nums[i] == 2) {
                    prev = 2;
                    last = i;
                }
            } else {
                if (nums[i] == 1) {
                    if (prev == 2) {
                        min = Math.min(min, i - last);
                        prev = 1;
                    }
                    last = i;
                } else if (nums[i] == 2) {
                    if (prev == 1) {
                        min = Math.min(min, i - last);
                        prev = 2;
                    }
                    last = i;
                }
            }
        }
        return min != Integer.MAX_VALUE ? min : -1;
    }
}
