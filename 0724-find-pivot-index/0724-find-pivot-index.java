class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        int psum = 0;
        for(int i=0; i<nums.length; i++){
            int lsum = psum;
            int rsum = sum - nums[i] - psum;
            psum += nums[i];
            if(lsum == rsum){
                return i;
            }
        }
        return -1;
    }
}