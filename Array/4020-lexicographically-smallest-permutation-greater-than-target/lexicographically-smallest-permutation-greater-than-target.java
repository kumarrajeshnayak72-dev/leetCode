class Solution {
    public String lexGreaterPermutation(String s, String target) {

        int n = s.length();

        // Characters left after trying to match target.
        int[] left = new int[26];

        for (int i = 0; i < n; i++) {
            left[s.charAt(i) - 'a']++;
            left[target.charAt(i) - 'a']--;
        }

        // Try to make the answer greater at the
        // rightmost possible position.
        for (int i = n - 1; i >= 0; i--) {

            int x = target.charAt(i) - 'a';

            // Put target[i] back because we are
            // no longer forcing this position to match.
            left[x]++;

            // Check whether target[0...i-1] can
            // actually be formed from s.
            boolean possible = true;

            for (int c : left) {
                if (c < 0) {
                    possible = false;
                    break;
                }
            }

            if (!possible) {
                continue;
            }

            // Find the smallest character > target[i].
            for (int c = x + 1; c < 26; c++) {

                if (left[c] > 0) {

                    left[c]--;

                    StringBuilder ans = new StringBuilder();

                    // Same prefix
                    ans.append(target, 0, i);

                    // Bigger character
                    ans.append((char) ('a' + c));

                    // Smallest possible suffix
                    for (int k = 0; k < 26; k++) {
                        while (left[k] > 0) {
                            ans.append((char) ('a' + k));
                            left[k]--;
                        }
                    }

                    return ans.toString();
                }
            }
        }

        return "";
    }
}

