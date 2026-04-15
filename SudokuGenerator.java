import java.util.ArrayList;

public class SudokuGenerator {

    private int[][] board = new int[9][9];

    public static void main(String[] args) {
        SudokuGenerator sudoku = new SudokuGenerator();
        sudoku.generateBoard();
        sudoku.printBoard();
    }

    public void generateBoard() {

        ArrayList<Integer> base = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            base.add(i);
        }

        for (int i = base.size() - 1; i > 0; i--) {
            int j = (int)(Math.random() * (i + 1));

            int temp = base.get(i);
            base.set(i, base.get(j));
            base.set(j, temp);
        }

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                int value = base.get((col + (row * 3) + (row / 3)) % 9);
                board[row][col] = value;
            }
        }
    }

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
