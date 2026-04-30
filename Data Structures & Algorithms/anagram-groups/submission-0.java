class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(String str : strs){
            int[] wordMap = new int[26];
            for(char c : str.toCharArray()){
                wordMap[c - 'a']++;
            }
            StringBuilder key = new StringBuilder();
            for(char c = 'a'; c <= 'z'; c++){
                key.append(c).append(wordMap[c - 'a']);
            }
            List<String> list = map.getOrDefault(key.toString(), new ArrayList<>());
            list.add(str);
            map.put(key.toString(), list);
        }
        return new ArrayList<>(map.values());
    }
}
