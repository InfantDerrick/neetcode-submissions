class Solution {
    public int longestConsecutive(int[] nums) {
        int max = nums.length > 0 ? 1 : 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums)
            set.add(num);
        for(int num : set){
            if(set.contains(num - 1) || !set.contains(num + 1)) continue;
            int count = 1;
            while(set.contains(++num)) count++;
            max = Math.max(max, count);
        }
        return max;
    }
}
