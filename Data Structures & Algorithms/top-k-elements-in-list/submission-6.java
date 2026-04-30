class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);

        List<Integer>[] buckets = new List[nums.length + 1];
        for(int num : map.keySet()){
            int count = map.get(num);
            if(buckets[count] == null) buckets[count] = new ArrayList<>();
            buckets[count].add(num);
        }

        int ans[] = new int[k];
        for(int i = 0, j = buckets.length - 1; j >= 0 && i < k; j--){
            if(buckets[j] != null){
                for(int num : buckets[j]){
                    if(i < k) ans[i++] = num;
                    else break;
                }
            }
        }

        return ans;
    }
}