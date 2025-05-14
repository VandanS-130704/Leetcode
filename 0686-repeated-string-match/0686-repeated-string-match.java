class Solution {
    public int repeatedStringMatch(String a, String b) {
        int count = 0;
        StringBuilder result = new StringBuilder();
        boolean match = false;
        
        while (!match) {
            result.append(a);
            count++;
            if (result.toString().contains(b)) {
                match = true;
            }
            if (result.length() > b.length() + a.length() * 2) {
                return -1;
            }
        }
        
        return count;
    }
}