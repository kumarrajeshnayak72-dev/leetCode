class Solution {
    public String lexGreaterPermutation(String s, String target) {

        int n = s.length();
        int[] left = new int[26];

        for (int i = 0; i < n; i++) {
            left[s.charAt(i) - 'a']++;
            left[target.charAt(i) - 'a']--;
        }

        for (int i = n - 1; i >= 0; i--) {

            int x = target.charAt(i) - 'a';
            left[x]++;

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

            for (int c = x + 1; c < 26; c++) {

                if (left[c] > 0) {

                    left[c]--;
                    StringBuilder ans = new StringBuilder();
                    ans.append(target, 0, i);
                    ans.append((char) ('a' + c));
                    
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

