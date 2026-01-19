
class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (s.indexOf(c) != i) continue;

            boolean duplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(j) == c) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) return i; // first non-repeating character
        }

        return -1;
    }
}

