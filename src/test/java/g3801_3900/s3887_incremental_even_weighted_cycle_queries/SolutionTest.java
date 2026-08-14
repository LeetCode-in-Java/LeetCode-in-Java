package g3801_3900.s3887_incremental_even_weighted_cycle_queries;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfEdgesAdded() {
        assertThat(
                new Solution().numberOfEdgesAdded(3, new int[][] {{0, 1, 1}, {1, 2, 1}, {0, 2, 1}}),
                equalTo(2));
    }

    @Test
    void numberOfEdgesAdded2() {
        assertThat(
                new Solution().numberOfEdgesAdded(3, new int[][] {{0, 1, 1}, {1, 2, 1}, {0, 2, 0}}),
                equalTo(3));
    }
}
