package g3801_3900.s3884_first_matching_character_from_both_ends;

// #Easy #String #Two_Pointers #Mid_Level #Weekly_Contest_495
// #2026_08_13_Time_0_ms_(100.00%)_Space_43.68_MB_(15.07%)

public class Solution {
    public int firstMatchingIndex(String s) {
        int l = 0;
        int h = s.length() - 1;
        while (l <= h) {
            if (s.charAt(l) == s.charAt(h)) {
                return l;
            }
            l++;
            h--;
        }
        return -1;
    }
}
