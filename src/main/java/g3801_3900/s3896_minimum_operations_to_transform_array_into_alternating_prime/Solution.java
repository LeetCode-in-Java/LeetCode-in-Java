package g3801_3900.s3896_minimum_operations_to_transform_array_into_alternating_prime;

// #Medium #Array #Math #Sorting #Binary_Search #Two_Pointers #Number_Theory #Senior
// #Biweekly_Contest_180 #2026_08_12_Time_18_ms_(97.87%)_Space_92.70_MB_(76.17%)

public class Solution {
    private static final int N = 100004;
    private static boolean[] sieve = new boolean[N];

    static {
        sieve[0] = sieve[1] = true;
        for (int i = 2; i <= 316; i++) {
            if (!sieve[i]) {
                for (int j = i * i; j < N; j += i) {
                    sieve[j] = true;
                }
            }
        }
    }

    public int minOperations(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = nums[i];
            if ((i & 1) == 1) {
                while (!sieve[j++]) {
                    res++;
                }
            } else {
                while (sieve[j++]) {
                    res++;
                }
            }
        }
        return res;
    }
}
