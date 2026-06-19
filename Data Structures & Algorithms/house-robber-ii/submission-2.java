class Solution {
    Map<String, Integer> map = new HashMap<>();
    public int rob(int[] nums) {
        return Math.max(nums[0] + helper(nums, 2, true), helper(nums, 1, false));
    }

    public int helper(int[] nums, int i, boolean first){
        if(i < 0 || i >= nums.length) return 0;
        if(first && i == nums.length - 1) return 0;
        if(map.containsKey(i + "+" + first)) return map.get(i + "+" + first);
        int ans = Math.max(nums[i] + helper(nums, i + 2, first), helper(nums, i + 1, first));
        map.put(i + "+" + first, ans);
        return ans;
    }
}
