
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Create our notebook to record where we see numbers
        HashSet<String> notebook = new HashSet<>();

        // Loop through all 9 rows
        for (int r = 0; r < 9; r++) {
            // Loop through all 9 columns
            for (int c = 0; c < 9; c++) {
                char val = board[r][c];

                // If the cell is empty ('.'), skip it
                if (val != '.') {
                    // Create the unique notes for this number
                    String rowNote = "row " + r + " has " + val;
                    String colNote = "col " + c + " has " + val;
                    String boxNote = "box " + (r / 3) + "-" + (c / 3) + " has " + val;

                    // Try to add them to the notebook. 
                    // If .add() returns false, it means the note was ALREADY there!
                    if (!notebook.add(rowNote) || !notebook.add(colNote) || !notebook.add(boxNote)) {
                        return false; // Found a duplicate! Invalid Sudoku.
                    }
                }
            }
        }

        // Checked the whole board and found no duplicates
        return true; 
    }
}
