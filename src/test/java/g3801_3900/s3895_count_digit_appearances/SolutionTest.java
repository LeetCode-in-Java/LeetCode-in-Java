package g3801_3900.s3895_count_digit_appearances;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countDigitOccurrences() {
        assertThat(new Solution().countDigitOccurrences(new int[] {12, 54, 32, 22}, 2), equalTo(4));
    }

    @Test
    void countDigitOccurrences2() {
        assertThat(new Solution().countDigitOccurrences(new int[] {1, 34, 7}, 9), equalTo(0));
    }
}
