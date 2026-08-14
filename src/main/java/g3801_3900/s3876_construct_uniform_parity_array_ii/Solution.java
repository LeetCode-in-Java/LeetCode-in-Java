package g3801_3900.s3876_construct_uniform_parity_array_ii;

// #Medium #Array #Math #Senior #Weekly_Contest_494
// #2026_08_13_Time_2_ms_(100.00%)_Space_121.98_MB_(11.30%)

public class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;
        for (int x : nums1) {
            min = Math.min(min, x);
        }
        if (min % 2 == 1) {
            return true;
        }
        for (int x : nums1) {
            if (x % 2 == 1) {
                return false;
            }
        }
        return true;
    }
}
