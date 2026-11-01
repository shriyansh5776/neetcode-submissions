class Solution {
    public int pivotIndex(int[] nums) {
        int sum =0 ;
        int n = nums.length;
        for(int i = 0 ;i<n;i++){
            sum+=nums[i];
        }
        int leftSum = 0 ;
        for(int i = 0 ;i<n;i++){
            sum-=nums[i];
            if(leftSum==sum) return i;
            leftSum+=nums[i];
        }
        return -1;
    }
}