class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> ml = new HashSet<>();
        for(int i = 0 ;i<nums.length;i++){
            if(ml.contains(nums[i])) return true ;
            else ml.add(nums[i]);
        }
        return false ;
    }
}