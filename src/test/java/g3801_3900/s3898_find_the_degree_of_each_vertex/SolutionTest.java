package g3801_3900.s3898_find_the_degree_of_each_vertex;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findDegrees() {
        assertThat(
                new Solution().findDegrees(new int[][] {{0, 1, 1}, {1, 0, 1}, {1, 1, 0}}),
                equalTo(new int[] {2, 2, 2}));
    }

    @Test
    void findDegrees2() {
        assertThat(
                new Solution().findDegrees(new int[][] {{0, 1, 0}, {1, 0, 0}, {0, 0, 0}}),
                equalTo(new int[] {1, 1, 0}));
    }

    @Test
    void findDegrees3() {
        assertThat(new Solution().findDegrees(new int[][] {{0}}), equalTo(new int[] {0}));
    }
}
