package g3801_3900.s3881_direction_assignments_with_exactly_k_visible_people;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countVisiblePeople() {
        assertThat(new Solution().countVisiblePeople(3, 1, 0), equalTo(2));
    }

    @Test
    void countVisiblePeople2() {
        assertThat(new Solution().countVisiblePeople(3, 2, 1), equalTo(4));
    }

    @Test
    void countVisiblePeople3() {
        assertThat(new Solution().countVisiblePeople(1, 0, 0), equalTo(2));
    }
}
