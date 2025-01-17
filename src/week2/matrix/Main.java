package week2.matrix;

public class Main {
    public static void main(String[] args) {
        Function function = new Function();
        int choice;
        while (true){
            System.out.println("========Calculator program========");
            System.out.println("1. Addition Matrix");
            System.out.println("2. Subtraction Matrix");
            System.out.println("3. Multiplication Matrix");
            System.out.println("4. Quit");
            System.out.print("Your choice: ");
            choice = Validation.getInt();

            switch (choice){
                case 1 -> {
                    System.out.println("-------- Addition --------");
                    Matrix matrix1 = function.inputMatrix("Matrix 1");
                    Matrix matrix2 = function.inputMatrix("Matrix 2");
                    function.additionMatrix(matrix1,matrix2);

                }
                case 2 -> {
                    System.out.println("-------- Subtraction --------");

                    Matrix matrix1 = function.inputMatrix("Matrix 1");
                    Matrix matrix2 = function.inputMatrix("Matrix 2");
                    function.subtractionMatrix(matrix1,matrix2);
                }
                case 3 -> {
                    System.out.println("-------- multiplication --------");
                    Matrix matrix1 = function.inputMatrix("Matrix 1");
                    Matrix matrix2 = function.inputMatrix("Matrix 2");
                    function.multiplicationMatrix(matrix1,matrix2);
                }
                case 4 -> {
                    System.exit(0);
                }
            }
        }
    }
}
