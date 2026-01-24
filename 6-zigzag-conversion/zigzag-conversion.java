class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        int currRow = 0;
        boolean goingDown = true;

    
        for (char c : s.toCharArray()) {
            rows.get(currRow).append(c);

           
            if (currRow == 0) {
                goingDown = true;
            } else if (currRow == numRows - 1) {
                goingDown = false;
            }

            currRow = goingDown ? currRow + 1 : currRow - 1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString(); 
    }
}