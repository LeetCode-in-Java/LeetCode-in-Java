package g3801_3900.s3891_minimum_increase_to_maximize_special_indices;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minIncrease() {
        assertThat(new Solution().minIncrease(new int[] {1, 2, 2}), equalTo(1L));
    }

    @Test
    void minIncrease2() {
        assertThat(new Solution().minIncrease(new int[] {2, 1, 1, 3}), equalTo(2L));
    }

    @Test
    void minIncrease3() {
        assertThat(new Solution().minIncrease(new int[] {5, 2, 1, 4, 3}), equalTo(4L));
    }
}
