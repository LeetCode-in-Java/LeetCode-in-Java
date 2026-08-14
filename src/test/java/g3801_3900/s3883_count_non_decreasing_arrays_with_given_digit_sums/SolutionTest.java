package g3801_3900.s3883_count_non_decreasing_arrays_with_given_digit_sums;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countArrays() {
        assertThat(new Solution().countArrays(new int[] {25, 1}), equalTo(6));
    }

    @Test
    void countArrays2() {
        assertThat(new Solution().countArrays(new int[] {1}), equalTo(4));
    }

    @Test
    void countArrays3() {
        assertThat(new Solution().countArrays(new int[] {2, 49, 23}), equalTo(0));
    }
}
