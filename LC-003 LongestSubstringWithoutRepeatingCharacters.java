class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int maxLength = 0;

        Set<Character> hs = new HashSet();

        while (j < s.length()) {
            if (!hs.contains(s.charAt(j))) {
                hs.add(s.charAt(j));
                maxLength = Math.max(maxLength, hs.size());
                j++;
            } else {
                hs.remove(s.charAt(i));
                i++;
            }
        }

        return maxLength;
    }
}
