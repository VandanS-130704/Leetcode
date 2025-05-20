class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int a = 0;
        for(int i = 0; i < stones.length(); i++){
            for(int j = 0; j < jewels.length(); j++){
                if(stones.charAt(i) == jewels.charAt(j)){
                    a++;
                    break;
                }
            }
        }
        return a;
    }
}