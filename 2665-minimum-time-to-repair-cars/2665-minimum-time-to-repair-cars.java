import java.util.*;

class Solution {
    public long repairCars(int[] ranks, int cars) {
        Arrays.sort(ranks); // Sorting mechanics for better efficiency

        long left = 1, right = (long) ranks[0] * (long) cars * cars; // Search range
        
        while (left < right) {
            long mid = left + (right - left) / 2;
            if (canRepairInTime(ranks, cars, mid)) {
                right = mid; // Try a smaller time
            } else {
                left = mid + 1; // Increase time
            }
        }

        return left; // Minimum time to repair all cars
    }

    private boolean canRepairInTime(int[] ranks, int cars, long maxTime) {
        int count = 0;
        for (int rank : ranks) {
            count += (int) Math.sqrt(maxTime / rank);
            if (count >= cars) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] ranks1 = {4, 2, 3, 1};
        int cars1 = 10;
        System.out.println(sol.repairCars(ranks1, cars1));

        int[] ranks2 = {5, 1, 8};
        int cars2 = 6;
        System.out.println(sol.repairCars(ranks2, cars2));
    }
}
