class Solution {
    public boolean doesContain(int[] arr ,int n){
        for(int i = 0 ;i<arr.length;i++){
            if(n==arr[i]) return true ;
        }
        return false ;
    }
    public int firstMissingPositive(int[] nums) {
        int max =Integer.MIN_VALUE;
        for(int i = 0 ;i<nums.length;i++){
            if(max<nums[i])max= nums[i];
        }
        if(max<0) return 1 ;
        if(max==0) return 1 ;
        for(int i = 1 ;i<=max;i++){
            if(!doesContain(nums,i)) return i ;
        }
        return max+1;
    }
}