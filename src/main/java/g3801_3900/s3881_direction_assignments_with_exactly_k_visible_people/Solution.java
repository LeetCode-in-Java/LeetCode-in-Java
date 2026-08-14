package g3801_3900.s3881_direction_assignments_with_exactly_k_visible_people;

// #Medium #Math #Combinatorics #Staff #Biweekly_Contest_179
// #2026_08_13_Time_4_ms_(100.00%)_Space_42.91_MB_(67.27%)

@SuppressWarnings("java:S1172")
public class Solution {
    private static final long MOD = 1_000_000_007L;

    public int countVisiblePeople(int n, int pos, int k) {
        int total = n - 1;
        long combinations = nCr(total, k);
        return (int) (2L * combinations % MOD);
    }

    private long nCr(int n, int r) {
        r = Math.min(r, n - r);
        long numerator = 1;
        long denominator = 1;
        for (int i = 1; i <= r; i++) {
            numerator = numerator * (n - r + i) % MOD;
            denominator = denominator * i % MOD;
        }
        return numerator * modPow(denominator, MOD - 2) % MOD;
    }

    private long modPow(long base, long exponent) {
        long result = 1;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = result * base % MOD;
            }

            base = base * base % MOD;
            exponent >>= 1;
        }
        return result;
    }
}
