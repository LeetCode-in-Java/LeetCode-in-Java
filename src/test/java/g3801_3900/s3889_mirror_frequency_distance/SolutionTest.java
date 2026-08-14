package g3801_3900.s3889_mirror_frequency_distance;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mirrorFrequency() {
        assertThat(new Solution().mirrorFrequency("ab1z9"), equalTo(3));
    }

    @Test
    void mirrorFrequency2() {
        assertThat(new Solution().mirrorFrequency("4m7n"), equalTo(2));
    }

    @Test
    void mirrorFrequency3() {
        assertThat(new Solution().mirrorFrequency("byby"), equalTo(0));
    }
}
