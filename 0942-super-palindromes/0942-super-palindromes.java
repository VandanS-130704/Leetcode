class Solution {
    public int superpalindromesInRange(String left, String right) {
        int ans = 9 >= Long.parseLong(left) && 9 <= Long.parseLong(right) ? 1 : 0;
        for (int i = 1; i < 19684; i++) {
            String num = Integer.toString(i, 3);
            if (isPal(num)) {
                long square = Long.parseLong(num) * Long.parseLong(num);
                if (square > Long.parseLong(right)) return ans;
                if (square >= Long.parseLong(left) && isPal(Long.toString(square))) ans++;
            }
        }
        return ans;
    }
    
    private boolean isPal(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--)
            if (str.charAt(i) != str.charAt(j)) return false;
        return true;
    }
}