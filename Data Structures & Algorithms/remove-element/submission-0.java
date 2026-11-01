class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0 ;
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i]!=val){
                k++;
            }
            else nums[i] = -1 ;
        }
        for(int i = 0 ;i<nums.length;i++){
            for(int j = i+1;j<=nums.length-1;j++){
                if(nums[i]==-1 && nums[j]!=-1){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp ;
                }
            }
        }
        return k ;
    }
}