package g3801_3900.s3896_minimum_operations_to_transform_array_into_alternating_prime;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(new int[] {1, 2, 3, 4}), equalTo(3));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(new int[] {5, 6, 7, 8}), equalTo(0));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations(new int[] {4, 4}), equalTo(1));
    }
}
