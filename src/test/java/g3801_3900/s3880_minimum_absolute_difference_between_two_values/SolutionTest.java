package g3801_3900.s3880_minimum_absolute_difference_between_two_values;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minAbsoluteDifference() {
        assertThat(new Solution().minAbsoluteDifference(new int[] {1, 0, 0, 2, 0, 1}), equalTo(2));
    }

    @Test
    void minAbsoluteDifference2() {
        assertThat(new Solution().minAbsoluteDifference(new int[] {1, 0, 1, 0}), equalTo(-1));
    }
}
