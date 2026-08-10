class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int x : nums) map.put(x, map.getOrDefault(x, 0) + 1);

        Queue<Integer> buckets[] = new Queue[nums.length + 1];
        int max = Integer.MIN_VALUE;
        for(int x : map.keySet()){
            int freq = map.get(x);
            if(buckets[freq] == null) buckets[freq] = new LinkedList<>();
            buckets[freq].add(x);
            max = Math.max(max, freq);
        }
        int ans[] = new int[k];
        for (int i = max; k > 0 && i > 0; k--){
            while(buckets[i] == null || buckets[i].isEmpty()) i--;
            ans[k - 1] = buckets[i].poll();
        }
        return ans;
    }
}
