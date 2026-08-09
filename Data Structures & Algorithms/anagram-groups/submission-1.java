class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            int[] strMap = new int[26];
            for(char c : str.toCharArray())
                strMap[c - 'a']++;
            StringBuilder sb = new StringBuilder();
            for(int x : strMap)
                sb.append(x).append('#');
            List<String> subList = map.getOrDefault(sb.toString(), new ArrayList<>());
            subList.add(str);
            map.put(sb.toString(), subList);
        }
        return new ArrayList<>(map.values());
    }
}
