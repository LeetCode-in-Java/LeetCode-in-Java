package g3801_3900.s3884_first_matching_character_from_both_ends;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void firstMatchingIndex() {
        assertThat(new Solution().firstMatchingIndex("abcacbd"), equalTo(1));
    }

    @Test
    void firstMatchingIndex2() {
        assertThat(new Solution().firstMatchingIndex("abc"), equalTo(1));
    }

    @Test
    void firstMatchingIndex3() {
        assertThat(new Solution().firstMatchingIndex("abcdab"), equalTo(-1));
    }
}
