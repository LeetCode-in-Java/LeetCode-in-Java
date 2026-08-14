package g3801_3900.s3878_count_good_subarrays;

// #Hard #Array #Bit_Manipulation #Stack #Monotonic_Stack #Senior_Staff #Weekly_Contest_494
// #2026_08_13_Time_6_ms_(100.00%)_Space_105.66_MB_(98.88%)

public class Solution {
    public long countGoodSubarrays(int[] nums) {
        int n = nums.length;
        long ans = 0;
        int[] prev = new int[n];
        for (int i = 0; i < n; i++) {
            int left = i - 1;
            while (left >= 0 && (nums[left] | nums[i]) == nums[i]) {
                left = prev[left];
            }
            prev[i] = left;
            int right = i + 1;
            while (right < n && nums[right] != nums[i] && (nums[right] | nums[i]) == nums[i]) {
                right++;
            }
            ans += (long) (i - left) * (right - i);
        }
        return ans;
    }
}
