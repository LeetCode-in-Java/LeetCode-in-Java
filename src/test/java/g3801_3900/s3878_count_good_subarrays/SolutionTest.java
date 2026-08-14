package g3801_3900.s3878_count_good_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countGoodSubarrays() {
        assertThat(new Solution().countGoodSubarrays(new int[] {4, 2, 3}), equalTo(4L));
    }

    @Test
    void countGoodSubarrays2() {
        assertThat(new Solution().countGoodSubarrays(new int[] {1, 3, 1}), equalTo(6L));
    }
}
