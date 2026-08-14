package g3801_3900.s3892_minimum_operations_to_achieve_at_least_k_peaks;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(new int[] {2, 1, 2}, 1), equalTo(1));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(new int[] {4, 5, 3, 6}, 2), equalTo(0));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations(new int[] {3, 7, 3}, 2), equalTo(-1));
    }
}
