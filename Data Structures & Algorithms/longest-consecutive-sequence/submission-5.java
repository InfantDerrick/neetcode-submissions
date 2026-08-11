class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int x : nums)
            set.add(x);
        int max = 0;
        for(int x : nums){
            if(!set.contains(x + 1)){
                int num = 1;
                while(set.contains(--x)) num++;
                max = Math.max(max, num);
            }
        }
        return max;
    }
}