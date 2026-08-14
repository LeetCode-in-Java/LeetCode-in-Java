package g3801_3900.s3882_minimum_xor_path_in_a_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCost() {
        assertThat(new Solution().minCost(new int[][] {{1, 2}, {3, 4}}), equalTo(6));
    }

    @Test
    void minCost2() {
        assertThat(new Solution().minCost(new int[][] {{6, 7}, {5, 8}}), equalTo(9));
    }

    @Test
    void minCost3() {
        assertThat(new Solution().minCost(new int[][] {{2, 7, 5}}), equalTo(0));
    }
}
