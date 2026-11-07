class Solution {
    public List<List<Integer>> threeSum(int[] nums){
     List<List<Integer>> ml = new ArrayList<>();
     Arrays.sort(nums);
     if(nums.length<3) return ml ;
     for(int i = 0 ;i<nums.length-2;i++){
        int l = i+1 ;
        int r = nums.length-1 ;
        if (i > 0 && nums[i] == nums[i - 1]) continue;
        while(l<r){
            int sum = nums[i]+nums[l]+nums[r];
            if(sum == 0 ){ ml.add(new ArrayList<>(List.of(nums[i],nums[l],nums[r])));
            l++;
            r--;
            while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r && nums[r] == nums[r + 1]) r--;}
            else if(sum>0){
                r--;
            }
            else l++;
        }
     }   
    return ml ;
    }
}
