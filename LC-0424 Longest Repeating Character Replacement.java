class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> map = new HashMap<>();
        int maxLength = 0;
        int maxFreq = 0;
        int start = 0;
        int end = 0;

        while (end < s.length()) {
            char currentChar = s.charAt(end);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(currentChar));

            // window length - maxFreq <= k
            if (end - start + 1 - maxFreq > k) {
               char startChar = s.charAt(start); 
               map.put(startChar, map.get(startChar) - 1);
               start++;
            }
            
            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        }

        return maxLength;
    }
}
