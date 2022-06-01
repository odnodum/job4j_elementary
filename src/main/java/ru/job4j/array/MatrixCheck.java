package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = row; i < board[row].length; i++) {
            if (board[row][i - 1] != 'X') {
                result = false;
            }
        }
        return result;
    }
}
