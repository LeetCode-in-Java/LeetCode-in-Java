package g3801_3900.s3886_sum_of_sortable_integers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sortableIntegers() {
        assertThat(new Solution().sortableIntegers(new int[] {3, 1, 2}), equalTo(3));
    }

    @Test
    void sortableIntegers2() {
        assertThat(new Solution().sortableIntegers(new int[] {7, 6, 5}), equalTo(0));
    }

    @Test
    void sortableIntegers3() {
        assertThat(new Solution().sortableIntegers(new int[] {5, 8}), equalTo(3));
    }
}
