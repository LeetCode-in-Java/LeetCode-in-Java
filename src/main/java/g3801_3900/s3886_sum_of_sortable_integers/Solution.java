package g3801_3900.s3886_sum_of_sortable_integers;

// #Hard #Array #Math #Sorting #Enumeration #Senior_Staff #Weekly_Contest_495
// #2026_08_13_Time_8_ms_(98.86%)_Space_67.62_MB_(98.86%)

public class Solution {
    // Changed method name from sumOfSortableIntegers to sortableIntegers
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int[] prefMax = new int[n];
        prefMax[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefMax[i] = Math.max(prefMax[i - 1], nums[i]);
        }
        int[] suffMin = new int[n];
        suffMin[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffMin[i] = Math.min(suffMin[i + 1], nums[i]);
        }
        int[] prefDrops = new int[n];
        for (int i = 1; i < n; i++) {
            prefDrops[i] = prefDrops[i - 1] + (nums[i - 1] > nums[i] ? 1 : 0);
        }
        int sumOfK = 0;
        for (int k = 1; k <= n; k++) {
            if (n % k == 0 && (isSortable(k, n, nums, prefMax, suffMin, prefDrops))) {
                sumOfK += k;
            }
        }
        return sumOfK;
    }

    private boolean isSortable(
            int k, int n, int[] nums, int[] prefMax, int[] suffMin, int[] prefDrops) {
        for (int idx = k; idx < n; idx += k) {
            if (prefMax[idx - 1] > suffMin[idx]) {
                return false;
            }
        }
        for (int start = 0; start < n; start += k) {
            int end = start + k - 1;
            int internalDrops = prefDrops[end] - prefDrops[start];
            int cyclicDrop = (nums[end] > nums[start]) ? 1 : 0;
            if (internalDrops + cyclicDrop > 1) {
                return false;
            }
        }
        return true;
    }
}
