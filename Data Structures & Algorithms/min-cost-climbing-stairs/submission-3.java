class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(helper(cost, 0), helper(cost, 1));
    }
    public int helper(int[] cost, int i){
        if(i >= cost.length) return 0;
        if(map.containsKey(i)) return map.get(i);
        int ans = Math.min(helper(cost, i + 1), helper(cost, i + 2)) + cost[i];
        map.put(i, ans);
        return ans;
    }
}
