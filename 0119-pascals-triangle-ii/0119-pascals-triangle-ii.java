class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long num = 1;  
        
        for (int k = 0; k <= rowIndex; k++) {
            row.add((int) num);
            num = num * (rowIndex - k) / (k + 1); 
        }
        
        return row;
    }
}