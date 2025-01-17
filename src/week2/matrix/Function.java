package week2.matrix;

public class Function {
    public void additionMatrix(Matrix matrix1, Matrix matrix2){
        int row = matrix1.getRow();
        int column = matrix1.getColumn();
        Matrix result = new Matrix(row, column);
        if (matrix1.getRow() != matrix2.getRow() || matrix2.getColumn() != matrix2.getColumn()){
            System.err.println("Matrix must have same dimesion for addition");
        }
        System.out.println("--------- Result ---------");
        matrix1.displayMatrix();
        System.out.println("+");
        matrix2.displayMatrix();
        System.out.println("=");

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                int value = matrix1.getValue(i, j) + matrix2.getValue(i, j);
                result.setvalue(i, j, value);
            }
        }
        result.displayMatrix();
    }

    public void subtractionMatrix(Matrix matrix1, Matrix matrix2){
        int row = matrix1.getRow();
        int column = matrix1.getColumn();
        Matrix result = new Matrix(row, column);
        if (matrix1.getRow() != matrix2.getRow() || matrix1.getColumn() != matrix2.getColumn()){
            System.err.println("Matrix must be have the same dimension");
        }
        System.out.println("--------- Result ---------");
        matrix1.displayMatrix();
        System.out.println("-");
        matrix2.displayMatrix();
        System.out.println("=");

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                int value = matrix1.getValue(i, j) + matrix2.getValue(i, j);
                result.setvalue(i,j,value);
            }
        }
        result.displayMatrix();
    }
    public void multiplicationMatrix(Matrix matrix1, Matrix matrix2){
        if (matrix1.getColumn() != matrix2.getRow()){
            System.err.println("Column must equal the number of row ");
        }
        int row = matrix1.getRow();
        int column = matrix2.getColumn();
        Matrix result = new Matrix(row, column);
        System.out.println("--------- Result ---------");
        matrix1.displayMatrix();
        System.out.println("*");
        matrix2.displayMatrix();
        System.out.println("=");

        for(int i = 1 ; i <= row ; i++){
            for (int j = 1; j <= column; j++) {
                int value = 0;
                for (int k = 0; k < matrix1.getColumn(); k++) {
                    value += matrix1.getValue(i, k) * matrix2.getValue(k, j);
                }
                result.setvalue(i, j, value);
            }
        }
        result.displayMatrix();
    }

    public Matrix inputMatrix(String matrixName){
        int matrixRow = Validation.getInt("Enter matrix row: ");
        int matrixColumn = Validation.getInt("Enter matrix column: ");
        Matrix matrix = new Matrix(matrixRow, matrixColumn);

        for (int i = 1; i <= matrixRow; i++) {
            for (int j = 1; j <= matrixColumn; j++) {
                matrix.setvalue(i, j, Validation.getInt("Enter " + matrixName + "[" +i + "]" + "[" + j + "]: "));
            }
        }
        return matrix;
    }
}
