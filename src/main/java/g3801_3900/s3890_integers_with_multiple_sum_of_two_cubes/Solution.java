package g3801_3900.s3890_integers_with_multiple_sum_of_two_cubes;

// #Medium #Hash_Table #Sorting #Counting #Enumeration #Staff #Weekly_Contest_496
// #2026_08_13_Time_169_ms_(93.96%)_Space_154.93_MB_(48.99%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<Integer> findGoodIntegers(int n) {
        Set<Integer> present = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int i = 1; i < 1000; i++) {
            int more = i * i * i;
            for (int j = 1; j <= i; j++) {
                int less = j * j * j;
                int sum = more + less;
                if (sum <= n) {
                    if (present.contains(sum)) {
                        result.add(sum);
                    } else {
                        present.add(sum);
                    }
                } else {
                    break;
                }
            }
        }
        List<Integer> ret = new ArrayList<>(result);
        Collections.sort(ret);
        return ret;
    }
}
