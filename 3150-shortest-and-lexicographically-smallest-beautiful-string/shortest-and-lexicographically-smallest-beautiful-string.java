class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        int n = s.length();
        int[] ones = new int[n];
        int count = 0;

        // Store positions of all 1s
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                ones[count++] = i;
            }
        }

        // Not enough 1s
        if (count < k) {
            return "";
        }

        String ans = "";
        int minLen = Integer.MAX_VALUE;

        // Take every k consecutive 1s
        for (int i = 0; i + k - 1 < count; i++) {

            int left = ones[i];
            int right = ones[i + k - 1];

            int len = right - left + 1;

            String sub = s.substring(left, right + 1);

            if (len < minLen) {
                minLen = len;
                ans = sub;
            } else if (len == minLen && sub.compareTo(ans) < 0) {
                ans = sub;
            }
        }

        return ans;
    }
}