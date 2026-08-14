package g3801_3900.s3885_design_event_manager;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void eventManager() {
        EventManager manager = new EventManager(new int[][] {{5, 7}, {2, 7}, {9, 4}});
        assertThat(manager.pollHighest(), equalTo(2));
    }

    @Test
    void eventManager2() {
        EventManager manager = new EventManager(new int[][] {{5, 7}, {2, 7}, {9, 4}});
        manager.pollHighest();
        manager.updatePriority(9, 7);
        assertThat(manager.pollHighest(), equalTo(5));
    }

    @Test
    void eventManager3() {
        EventManager manager = new EventManager(new int[][] {{5, 7}, {2, 7}, {9, 4}});
        manager.pollHighest();
        manager.updatePriority(9, 7);
        manager.pollHighest();
        assertThat(manager.pollHighest(), equalTo(9));
    }

    @Test
    void eventManager4() {
        EventManager manager = new EventManager(new int[][] {{4, 1}, {7, 2}});
        assertThat(manager.pollHighest(), equalTo(7));
    }

    @Test
    void eventManager5() {
        EventManager manager = new EventManager(new int[][] {{4, 1}, {7, 2}});
        manager.pollHighest();
        assertThat(manager.pollHighest(), equalTo(4));
    }

    @Test
    void eventManager6() {
        EventManager manager = new EventManager(new int[][] {{4, 1}, {7, 2}});
        manager.pollHighest();
        manager.pollHighest();
        assertThat(manager.pollHighest(), equalTo(-1));
    }
}
