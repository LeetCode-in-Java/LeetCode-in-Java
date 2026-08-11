package g3801_3900.s3894_traffic_signal_color;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void trafficSignal() {
        assertThat(new Solution().trafficSignal(60), equalTo("Red"));
    }

    @Test
    void trafficSignal2() {
        assertThat(new Solution().trafficSignal(5), equalTo("Invalid"));
    }

    @Test
    void trafficSignal3() {
        assertThat(new Solution().trafficSignal(0), equalTo("Green"));
    }

    @Test
    void trafficSignal4() {
        assertThat(new Solution().trafficSignal(30), equalTo("Orange"));
    }

    @Test
    void trafficSignal5() {
        assertThat(new Solution().trafficSignal(100), equalTo("Invalid"));
    }
}
