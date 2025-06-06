class Solution {
    public int expressiveWords(String s, String[] words) {
        int count = 0;
        for (String word: words) {
            if (isStretchy(word, s)) count++;
        }
        return count;
    }
    
    private boolean isStretchy(String word, String s) {
        int sIndex = 0;
        int wordIndex = 0;
        while (sIndex < s.length() && wordIndex < word.length()) {
            char wordLetter = word.charAt(wordIndex);
            int wordLetterCount = 0;
            while (wordIndex < word.length() && word.charAt(wordIndex) == wordLetter) {
                wordIndex++;
                wordLetterCount++;
            } 
            char sLetter = s.charAt(sIndex);
            int sLetterCount = 0;
            while (sIndex < s.length() && s.charAt(sIndex) == sLetter) {
                sIndex++;
                sLetterCount++;
            }

            if (wordLetter != sLetter) return false;
            if (wordLetterCount > sLetterCount) return false;
            if (wordLetterCount != sLetterCount && sLetterCount < 3) return false;
        }
        if (sIndex == s.length() && wordIndex == word.length()) return true;
        else return false;
    }
}