package g3801_3900.s3889_mirror_frequency_distance;

// #Medium #String #Hash_Table #Counting #Senior #Weekly_Contest_496
// #2026_08_13_Time_18_ms_(99.69%)_Space_56.73_MB_(92.00%)

public class Solution {
    public int mirrorFrequency(String s) {
        int[] freq = new int[257];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char curr = s.charAt(i);
            freq[curr]++;
        }
        int ans = 0;
        for (int i = 'a'; i <= 'z'; i++) {
            if (freq[i] > 0) {
                ans = ans + Math.abs(freq[i] - freq['z' - (i - 'a')]);
                freq[i] = 0;
                freq['z' - (i - 'a')] = 0;
            }
        }
        for (int i = '0'; i <= '9'; i++) {
            if (freq[i] > 0) {
                ans = ans + Math.abs(freq[i] - freq['9' - (i - '0')]);
                freq[i] = 0;
                freq['9' - (i - '0')] = 0;
            }
        }
        return ans;
    }
}
