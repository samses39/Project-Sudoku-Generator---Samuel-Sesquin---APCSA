import java.util.ArrayList;
import java.util.Collections;

public class SudokuGenerator {

    // 9x9 Sudoku board (2D array)
    private int[][] board = new int[9][9];

    public static void main(String[] args) {
        SudokuGenerator sudoku = new SudokuGenerator();
        sudoku.generateBoard();
        sudoku.printBoard();
    }

    // Method to generate Sudoku board
    public void generateBoard() {

        // Create base numbers 1–9 using ArrayList
        ArrayList<Integer> base = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            base.add(i);
        }

        // Shuffle for randomness
        Collections.shuffle(base);

        // Fill board using pattern
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                // Pattern formula
                int value = base.get((col + (row * 3) + (row / 3)) % 9);
                board[row][col] = value;
            }
        }
    }

    // Method to print board neatly
    public void printBoard() {
        System.out.println("Solved Sudoku Board:\n");

        for (int i = 0; i < 9; i++) {

            if (i % 3 == 0 && i != 0) {
                System.out.println("------+-------+------");
            }

            for (int j = 0; j < 9; j++) {

                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }

                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }
}
