

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int longest = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (num == Integer.MIN_VALUE || !set.contains(num - 1)) {
                int cnt = 1;
                int current = num;

                while (current != Integer.MAX_VALUE
                        && set.contains(current + 1)) {
                    current++;
                    cnt++;
                }

                longest = Math.max(longest, cnt);
            }
        }

        return longest;
    }
}
