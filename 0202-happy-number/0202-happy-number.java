class Solution {
    public boolean isHappy(int n) {
        int slow = n, fast = getNext(n);

        while (fast != 1 && slow != fast) {
            slow = getNext(slow);       // Moves one step
            fast = getNext(getNext(fast)); // Moves two steps
        }
        
        return fast == 1;  // If we reach 1, it's a happy number
    }

    public int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;  // Square the digit and add to sum
            n /= 10;  // Remove last digit
        }
        return sum;
    }
}
