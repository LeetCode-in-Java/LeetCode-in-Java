package g3801_3900.s3890_integers_with_multiple_sum_of_two_cubes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findGoodIntegers() {
        assertThat(new Solution().findGoodIntegers(4104), equalTo(Arrays.asList(1729, 4104)));
    }

    @Test
    void findGoodIntegers2() {
        assertThat(new Solution().findGoodIntegers(578), equalTo(Collections.emptyList()));
    }
}
