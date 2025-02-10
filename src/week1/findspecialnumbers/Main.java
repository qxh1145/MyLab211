package week1.findspecialnumbers;

public class Main {
    public static void main(String[] args) {
        Function function = new Function();
        int choice = 0;
        while (true) {
            System.out.println("=========Equation Program=========");
            System.out.println("1.Calculate Superlative Equation ");
            System.out.println("2. Calculate Quadratic Equation");
            System.out.println("3. Exit");
            System.out.println("Please choice one option");
            choice = Validation.getInt(1, 3);
            switch (choice) {
                case 1 -> {
                    System.out.println("-----Calculate Equation-----");
                    float a = Validation.getFloat("Enter A: ");
                    float b = Validation.getFloat("Enter B: ");
                    function.display(function.calculateEquation(a, b));

                }
                case 2 -> {
                    System.out.println("-----Calculate Quadratic Equation-----");
                    float a = Validation.getFloat("Enter A: ");
                    float b = Validation.getFloat("Enter B: ");
                    float c = Validation.getFloat("Enter C: ");
                    function.display(function.calculateQuadraticEquation(a, b, c));
                }
                case 3 -> System.exit(0);
            }
        }
    }
}