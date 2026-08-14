package g3801_3900.s3877_minimum_removals_to_achieve_target_xor;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minRemovals() {
        assertThat(new Solution().minRemovals(new int[] {1, 2, 3}, 2), equalTo(1));
    }

    @Test
    void minRemovals2() {
        assertThat(new Solution().minRemovals(new int[] {2, 4}, 1), equalTo(-1));
    }

    @Test
    void minRemovals3() {
        assertThat(new Solution().minRemovals(new int[] {7}, 7), equalTo(0));
    }
}
