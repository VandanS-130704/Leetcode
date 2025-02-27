class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            String pal1 = expand(s, i, i);
            String pal2 = expand(s, i, i + 1);
            
            longest = pal1.length() > longest.length() ? pal1 : longest;
            longest = pal2.length() > longest.length() ? pal2 : longest;
        }
        
        return longest;
    }
    
    private String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}