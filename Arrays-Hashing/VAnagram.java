class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charCounts = new HashMap<>();

        // Count characters in s
        for (char c : s.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Subtract counts using t
        for (char c : t.toCharArray()) {
            int count = charCounts.getOrDefault(c, 0);

            if (count == 0) {
                return false;
            }

            charCounts.put(c, count - 1);
        }

        return true;
    }
}