import java.util.HashMap;

class Solution {
    public static boolean areAnagrams(String s1, String s2) {

        if(s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char ch : s2.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }

        for(int freq : map.values()) {
            if(freq != 0) {
                return false;
            }
        }

        return true;
    }
}
