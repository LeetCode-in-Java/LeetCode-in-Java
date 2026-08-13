package g3801_3900.s3897_maximum_value_of_concatenated_binary_segments;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxValue() {
        assertThat(new Solution().maxValue(new int[] {1, 2}, new int[] {1, 0}), equalTo(14));
    }

    @Test
    void maxValue2() {
        assertThat(new Solution().maxValue(new int[] {3, 1}, new int[] {0, 3}), equalTo(120));
    }
}
