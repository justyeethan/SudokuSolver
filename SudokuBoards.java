public class SudokuBoards {

    private int[][] board1 = { { 8, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
            { 0, 7, 0, 0, 9, 0, 2, 0, 0 }, { 0, 5, 0, 0, 0, 7, 0, 0, 0 }, { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
            { 0, 0, 0, 1, 0, 0, 0, 3, 0 }, { 0, 0, 1, 0, 0, 0, 0, 6, 8 }, { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
            { 0, 9, 0, 0, 0, 0, 4, 0, 0 } };
    /** Unsolvable board */
    private int[][] board2 = { { 0, 4, 0, 2, 0, 0, 0, 0, 8 }, { 0, 0, 0, 0, 0, 0, 9, 5, 2 },
            { 8, 0, 9, 0, 0, 0, 0, 3, 0 }, { 0, 9, 0, 4, 3, 2, 5, 0, 1 }, { 2, 3, 0, 8, 0, 9, 0, 4, 9 },
            { 4, 0, 8, 6, 7, 5, 0, 9, 0 }, { 0, 5, 0, 0, 0, 0, 3, 0, 4 }, { 7, 6, 4, 0, 0, 0, 3, 0, 4 },
            { 3, 0, 0, 0, 0, 4, 0, 2, 0 } };

    private int[][] board3 = { { 9, 0, 0, 1, 0, 0, 0, 0, 5 }, { 0, 0, 5, 0, 9, 0, 2, 0, 1 },
            { 8, 0, 0, 0, 4, 0, 0, 0, 0 }, { 0, 0, 0, 0, 8, 0, 0, 0, 0 }, { 0, 0, 0, 7, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 2, 6, 0, 0, 9 }, { 2, 0, 0, 3, 0, 0, 0, 0, 6 }, { 0, 0, 0, 2, 0, 0, 9, 0, 0 },
            { 0, 0, 1, 9, 0, 4, 5, 7, 0 }, };
    private int[][] board4 = { { 8, 6, 0, 0, 2, 0, 0, 0, 0 }, { 0, 0, 0, 7, 0, 0, 0, 5, 9 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 6, 0, 8, 0, 0 }, { 0, 4, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 5, 3, 0, 0, 0, 0, 7 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 2, 0, 0, 0, 0, 6, 0, 0 },
            { 0, 0, 7, 5, 0, 9, 0, 0, 0 } };
    private int[][] board5 = { { 0, 0, 2, 0, 0, 0, 0, 0, 5 }, { 8, 9, 6, 5, 7, 1, 4, 0, 2 },
            { 0, 0, 0, 3, 0, 0, 0, 7, 0 }, { 0, 8, 0, 1, 0, 0, 9, 0, 0 }, { 6, 0, 0, 0, 0, 9, 0, 4, 8 },
            { 9, 0, 4, 6, 0, 2, 0, 1, 0 }, { 0, 1, 0, 0, 6, 3, 0, 0, 0 }, { 3, 0, 0, 9, 0, 5, 8, 2, 1 },
            { 4, 2, 0, 0, 0, 0, 3, 0, 0 } };
    private int[][] board6 = { { 3, 8, 5, 0, 0, 0, 0, 0, 0 }, { 9, 2, 1, 0, 0, 0, 0, 0, 0 },
            { 6, 4, 7, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 2, 3, 0, 0, 0 }, { 0, 0, 0, 7, 8, 4, 0, 0, 0 },
            { 0, 0, 0, 6, 9, 5, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 8, 7, 3 }, { 0, 0, 0, 0, 0, 0, 9, 6, 2 },
            { 0, 0, 0, 0, 0, 0, 1, 4, 5 } };

    public int[][] pickBoard() {
        switch ((int) (Math.random() * 6)) {
            case 1:
                return board1;
            case 2:
                return board2;
            case 3:
                return board3;
            case 4:
                return board4;
            case 5:
                return board5;
            default:
                return board6;
        }
    }
}
