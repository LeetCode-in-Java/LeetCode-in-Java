package g3801_3900.s3883_count_non_decreasing_arrays_with_given_digit_sums;

// #Hard #Array #Dynamic_Programming #Prefix_Sum #Senior_Staff #Biweekly_Contest_179
// #2026_08_13_Time_157_ms_(100.00%)_Space_46.79_MB_(100.00%)

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("unchecked")
public class Solution {
    private static final int M = 1000000007;

    private int s(int x) {
        int r = 0;
        while (x > 0) {
            r += x % 10;
            x /= 10;
        }
        return r;
    }

    public int countArrays(int[] d) {
        ArrayList<Integer>[] g = buildGroups();
        if (g[d[0]].isEmpty()) {
            return 0;
        }
        long[] dp = createInitialDp(g[d[0]].size());
        for (int i = 1; i < d.length; i++) {
            dp = transition(dp, g[d[i - 1]], g[d[i]]);
            if (dp.length == 0) {
                return 0;
            }
        }
        return sum(dp);
    }

    private ArrayList<Integer>[] buildGroups() {
        ArrayList<Integer>[] g = new ArrayList[51];
        for (int i = 0; i <= 50; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i <= 5000; i++) {
            g[s(i)].add(i);
        }
        return g;
    }

    private long[] createInitialDp(int size) {
        long[] dp = new long[size];
        Arrays.fill(dp, 1);
        return dp;
    }

    private long[] transition(long[] dp, ArrayList<Integer> previous, ArrayList<Integer> current) {
        if (current.isEmpty()) {
            return new long[0];
        }
        long[] prefix = buildPrefixSums(dp);
        long[] next = new long[current.size()];
        int k = 0;
        for (int j = 0; j < current.size(); j++) {
            while (k < previous.size() && previous.get(k) <= current.get(j)) {
                k++;
            }
            if (k > 0) {
                next[j] = prefix[k - 1];
            }
        }
        return next;
    }

    private long[] buildPrefixSums(long[] values) {
        long[] prefix = new long[values.length];
        prefix[0] = values[0];
        for (int i = 1; i < values.length; i++) {
            prefix[i] = (prefix[i - 1] + values[i]) % M;
        }
        return prefix;
    }

    private int sum(long[] values) {
        long result = 0;
        for (long value : values) {
            result = (result + value) % M;
        }
        return (int) result;
    }
}
