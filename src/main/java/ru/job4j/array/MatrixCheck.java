package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char findChar = 'X';

        for (int i = 0; i < board.length; i++) {
            if (i != row) {
                break;
            } else {
                for (int j = 0; j < board[row].length; j++) {
                    if (board[row][j] != findChar) {
                        result = false;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
