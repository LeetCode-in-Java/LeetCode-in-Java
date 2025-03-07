package g0001_0100.s0077_combinations;

// #Medium #Backtracking #Algorithm_I_Day_11_Recursion_Backtracking #Top_Interview_150_Backtracking
// #2025_03_05_Time_15_ms_(92.38%)_Space_92.30_MB_(94.55%)

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("java:S1149")
public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        // Boundary case
        if (n > 20 || k < 1 || k > n) {
            return ans;
        }
        backtrack(ans, n, k, 1, new ArrayDeque<>());
        return ans;
    }

    private void backtrack(
            List<List<Integer>> ans, int n, int k, int s, ArrayDeque<Integer> stack) {
        // Base case
        // If k becomes 0
        if (k == 0) {
            ans.add(new ArrayList<>(stack));
            return;
        }
        // Start with s till n-k+1
        for (int i = s; i <= (n - k) + 1; i++) {
            stack.push(i);
            // Update start for recursion and decrease k by 1
            backtrack(ans, n, k - 1, i + 1, stack);
            stack.pop();
        }
    }
}
