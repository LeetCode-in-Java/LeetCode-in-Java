package g3801_3900.s3885_design_event_manager;

// #Medium #Array #Hash_Table #Design #Heap_Priority_Queue #Ordered_Set #Senior #Weekly_Contest_495
// #2026_08_13_Time_185_ms_(98.91%)_Space_215.60_MB_(98.91%)

import java.util.HashMap;
import java.util.PriorityQueue;

public class EventManager {
    private final HashMap<Integer, Integer> map;
    private final PriorityQueue<Pair> pq;

    public EventManager(int[][] events) {
        map = new HashMap<>();
        pq =
                new PriorityQueue<>(
                        (a, b) -> {
                            if (a.priority != b.priority) {
                                return b.priority - a.priority;
                            }
                            return a.id - b.id;
                        });
        for (int[] event : events) {
            pq.add(new Pair(event[0], event[1]));
        }
    }

    public void updatePriority(int eventId, int newPriority) {
        map.put(eventId, newPriority);
        pq.add(new Pair(eventId, newPriority));
    }

    public int pollHighest() {
        if (pq.isEmpty()) {
            return -1;
        }
        while (true) {
            if (pq.isEmpty()) {
                return -1;
            }
            Pair p = pq.poll();
            int id = p.id;
            int pri = p.priority;
            if (map.containsKey(id)) {
                if (map.get(id) == pri) {
                    map.put(id, Integer.MAX_VALUE);
                    return id;
                }
            } else {
                return id;
            }
        }
    }

    public static class Pair {
        int id;
        int priority;

        Pair(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }
}

/*
 * Your EventManager object will be instantiated and called as such:
 * EventManager obj = new EventManager(events);
 * obj.updatePriority(eventId,newPriority);
 * int param_2 = obj.pollHighest();
 */
