class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] map = new char[26];
        for(char x : s.toCharArray())
            map[x - 'a']++;
        for(char x : t.toCharArray())
            if(map[x - 'a']-- == 0) return false;
        return true;
    }
}
