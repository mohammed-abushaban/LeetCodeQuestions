import java.util.HashMap;

public class IsAnagram {
    /*
     * Given two strings s and t, return true if t is an anagram of s, and false
     * otherwise.
     * 
     * An Anagram is a word or phrase formed by rearranging the letters of a
     * different word or phrase, typically using all the original letters exactly
     * once.
     * 
     * Example 1:
     * 
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     * Example 2:
     * 
     * Input: s = "rat", t = "car"
     * Output: false
     */

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c))
                map.put(c, 1);
            else
                map.put(c, map.get(c) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!map.containsKey(c)) {
                return false;
            }
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0)
                map.remove(c);
        }
        return true;
    }
}
