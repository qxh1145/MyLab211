package week2.matrix;

public class Matrix {
    private int row = 0;
    private int column = 0;
    private int matrix[][];

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        matrix = new int[row][column];
    }

    public void setvalue(int r, int c , int value){
        if (r > 0 && r <= row && c > 0 && c <= column) {
            matrix[r - 1][c - 1] = value;
        }
    }
    public int getValue(int r, int c) {
        if(r > 0 && r <= row && c > 0 && c <= column){
            return matrix[r - 1][c - 1];
        } else {
            return -1;
        }
    }
    public void displayMatrix(){
        for (int[] row : matrix){
            for (int value : row){
                System.out.print("[" + value + "] ");
            }
            System.out.println();
        }
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
