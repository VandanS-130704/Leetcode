class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder formatted = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '-') {
                formatted.append(Character.toUpperCase(c));
            }
        }

        int mod = formatted.length() % k;
        StringBuilder result = new StringBuilder();

        if (mod > 0) {
            result.append(formatted.substring(0, mod)).append("-");
        }

        for (int i = mod; i < formatted.length(); i += k) {
            result.append(formatted.substring(i, i + k)).append("-");
        }

        if (result.length() > 0 && result.charAt(result.length() - 1) == '-') {
            result.deleteCharAt(result.length() - 1);
        }

        return result.toString();
    }
}