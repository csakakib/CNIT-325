public class Board {
    protected static final int BOARD_SIZE = 10;
    protected char[][] grid;
    
    public Board() {
        grid = new char[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                grid[i][j] = ' ';
            }
        }
    }
    
    public char getCell(int row, int col) {
        if (isValidCoordinate(row, col)) {
            return grid[row][col];
        }
        return ' ';
    }
    
    public void setCell(int row, int col, char value) {
        if (isValidCoordinate(row, col)) {
            grid[row][col] = value;
        }
    }
    
    protected boolean isValidCoordinate(int row, int col) {
        return row >= 0 && row < BOARD_SIZE && col >= 0 && col < BOARD_SIZE;
    }
}
