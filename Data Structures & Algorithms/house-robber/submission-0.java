class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    public int rob(int[] nums) {
        return helper(nums, 0);
    }
    public int helper(int[] nums, int i){
        if(i >= nums.length) return 0;
        if(map.containsKey(i)) return map.get(i);
        int amount = Math.max(nums[i] + helper(nums, i + 2), helper(nums, i + 1));
        map.put(i, amount);
        return amount;
    }
}
