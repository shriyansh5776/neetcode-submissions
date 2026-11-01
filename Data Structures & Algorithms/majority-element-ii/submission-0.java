class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        }
        ArrayList<Integer> ml = new ArrayList<>();
        Iterator<Map.Entry<Integer, Integer>> it = mpp.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,Integer> entry = it.next();
            if(entry.getValue()>nums.length/3) ml.add(entry.getKey());
        }
        return ml;
    }
}