class Solution {
    public String reverseOnlyLetters(String s) {

        int i = 0 ;
        int j = s.length() - 1;

        char[] res = new char[j + 1];

        while(i <= j)
        {
            if(Character.isAlphabetic(s.charAt(i)) && Character.isAlphabetic(s.charAt(j)))
            {
                res[i] = s.charAt(j);
                res[j] = s.charAt(i);
                j--;
                i++;
            }
        else if(!Character.isAlphabetic(s.charAt(j)))
        {

            res[j] = s.charAt(j);
            j--;
        }
        else if(!Character.isAlphabetic(s.charAt(i)))
        {
            res[i] = s.charAt(i);
            i++;
        }

        }

        return new String(res);
        
    }
}