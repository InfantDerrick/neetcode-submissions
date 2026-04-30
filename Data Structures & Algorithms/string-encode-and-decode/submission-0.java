class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length()).append('#').append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int l = 0;
        while(l < str.length()){
            int r = l;
            while(str.charAt(r) != '#') r++;
            int length = Integer.parseInt(str.substring(l, r++));
            ans.add(str.substring(r, r + length));
            l = r + length;
        }
        return ans;
    }
}
