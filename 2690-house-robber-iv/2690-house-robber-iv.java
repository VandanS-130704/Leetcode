class Solution {
    public int minCapability(int[] nums, int k) {
        int left = 1, right = (int)1e9;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (canRob(nums, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
    
    private boolean canRob(int[] nums, int k, int maxCapability) {
        int count = 0;
        int i = 0;
        
        while (i < nums.length) {
            if (nums[i] <= maxCapability) {  
                count++; 
                i++;
            }
            i++; 
        }
        
        return count >= k;
    }
}
