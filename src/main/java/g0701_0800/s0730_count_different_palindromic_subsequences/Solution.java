package g0701_0800.s0730_count_different_palindromic_subsequences;

// #Hard #String #Dynamic_Programming

public class Solution {
    public int countPalindromicSubsequences(String s) {
        int big = 1000000007;
        int len = s.length();
        if (len < 2) {
            return len;
        }
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            int deta = 1;
            dp[i][i] = 1;
            int l2 = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (s.charAt(j) != c) {
                    dp[j][i] = deal(dp[j][i - 1] + deta, big);
                } else {
                    if (l2 < 0) {
                        l2 = j;
                        deta = dp[j + 1][i - 1] + 1;
                    } else {
                        deta = dp[j + 1][i - 1] - dp[j + 1][l2 - 1];
                    }
                    deta = deal(deta, big);
                    dp[j][i] = deal(dp[j][i - 1] + deta, big);
                }
            }
        }
        return deal(dp[0][len - 1], big);
    }

    private int deal(int x, int big) {
        x %= big;
        if (x < 0) {
            x += big;
        }
        return x;
    }
}