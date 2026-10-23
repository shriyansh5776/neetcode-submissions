class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> myList = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (myList.contains(nums[i])) {
                return true;
            }

            myList.add(nums[i]);

            if (myList.size() > k) {
                myList.remove(nums[i - k]);
            }
        }

        return false;
    }
}