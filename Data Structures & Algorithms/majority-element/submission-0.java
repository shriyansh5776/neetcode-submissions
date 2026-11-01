class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> ml = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            ml.put(nums[i], ml.getOrDefault(nums[i], 0) + 1);
        }
        for (int key : ml.keySet()) {
            if (ml.get(key) > nums.length / 2) {
                return key;
            }
        }
        return -1 ;
    }
}