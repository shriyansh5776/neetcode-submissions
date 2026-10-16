class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > n || nums[i] <= 0)
                nums[i] = Integer.MAX_VALUE;
        }
        for(int i = 0 ;i<n;i++){
            int val = Math.abs(nums[i]);
            if (val >= 1 && val <= n) {
                int index = val - 1;
                if (nums[index] > 0) {
                    nums[index] = -nums[index];
                }
            }
        }
        for(int i = 0 ;i<n;i++){
            if(nums[i]>0) return i+1 ;
            
        }
        return n+1 ;
    }
}