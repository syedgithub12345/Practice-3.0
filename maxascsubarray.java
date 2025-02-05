class maxascsubarray {
    public int maxAscendingSum(int[] nums) {
        int ans=0;
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
            sum+=nums[i];
            }
            else{
                ans=Math.max(ans,sum);
                sum=nums[i];
            }
        }ans=Math.max(ans,sum);
        return ans;
    }
}

// class maxascsubarray {
//     public int maxAscendingSum(int[] nums) {
//         int curr = nums[0], ans = nums[0];
//         for (int i = 1; i < nums.length; i++) {
//             curr = nums[i] > nums[i - 1] ? curr + nums[i] : nums[i];
//             ans = Math.max(ans, curr);
//         }
//         return ans;
//     }
// }