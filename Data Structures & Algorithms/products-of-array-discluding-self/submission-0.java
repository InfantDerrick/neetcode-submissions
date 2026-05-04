class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = 1;
        for(int i = 1; i < ans.length; i++){
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        int prod = nums[ans.length - 1];
        for(int i = ans.length - 2; i >= 0; i--){
            ans[i] = ans[i] * prod;
            prod *= nums[i];
        }
        return ans;
    }
}  
